package com.example;

public class User {
    private String name;
    private GreetingService greetingService;

    public void setName(String name) {
        this.name = name;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ".");
        greetingService.greet();
    }
}
