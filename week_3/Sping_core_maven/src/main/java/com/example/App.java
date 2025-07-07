package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MessageService messageService = context.getBean("messageService", MessageService.class);
        messageService.printMessage();
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Car car = (Car) context1.getBean("car");
        car.drive();
        User user = context.getBean("user", User.class);
        user.introduce();
    }
}
