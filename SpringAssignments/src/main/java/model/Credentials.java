package model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:datafile.properties")
public class Credentials {

    @Value("${URL}")
    private String url;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    public void display() {
        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
