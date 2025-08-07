package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import model.Credentials;

public class Main{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Credentials.class);
        Credentials creds = context.getBean(Credentials.class);
        creds.display();
        context.close();
    }
}
