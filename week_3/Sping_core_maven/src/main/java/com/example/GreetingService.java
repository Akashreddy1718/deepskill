package com.example;

public class GreetingService {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void greet() {
        System.out.println(message);
    }
}
