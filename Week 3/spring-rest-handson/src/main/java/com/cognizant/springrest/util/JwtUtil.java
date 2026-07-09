package com.cognizant.springrest.util;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

    // Secret key (must be at least 32 bytes for HS256)
    private static final String SECRET =
            "cognizantjwtsecretkeyforweek3handson123";

    private final Key key = new SecretKeySpec(
            SECRET.getBytes(StandardCharsets.UTF_8),
            SignatureAlgorithm.HS256.getJcaName());

    public String generateToken(String username) {

        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 3600000))
                .signWith(key)
                .compact();
    }
}