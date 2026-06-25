package com.cognizant;

public class UserService {

    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String name) {
        System.out.println(name + " registered successfully.");
        notificationService.sendNotification("Welcome " + name);
    }
}