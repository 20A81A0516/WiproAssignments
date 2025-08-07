package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Account;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account acc = (Account) context.getBean("account");
        acc.displayDetails();
        ((ClassPathXmlApplicationContext) context).close();
    }
}

