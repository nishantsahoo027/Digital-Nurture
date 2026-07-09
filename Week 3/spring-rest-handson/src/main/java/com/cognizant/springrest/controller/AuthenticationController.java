package com.cognizant.springrest.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springrest.model.AuthenticationResponse;
import com.cognizant.springrest.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {

        String username = getUsername(authorizationHeader);

        String token = jwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }

    private String getUsername(String authorizationHeader) {

        String base64Credentials =
                authorizationHeader.substring("Basic ".length());

        byte[] decodedBytes =
                Base64.getDecoder().decode(base64Credentials);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        return credentials.split(":")[0];
    }
}