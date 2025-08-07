package com.example;

import com.example.config.AppConfig;
import com.example.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService service = ctx.getBean(PersonService.class);
        service.performOperations();
        ctx.close();
    }
}




/*
List of person is:
Person{id=1, age=25, firstName='Alice', lastName='Johnson'}
Person{id=2, age=30, firstName='Bob', lastName='Smith'}
Person{id=3, age=28, firstName='Charlie', lastName='Brown'}
Person{id=4, age=22, firstName='David', lastName='Wilson'}
Person{id=5, age=35, firstName='Eva', lastName='Miller'}

Get person with ID 2
Person{id=2, age=30, firstName='Bob', lastName='Smith'}

Creating person:

List of person is:
Person{id=1, age=25, firstName='Alice', lastName='Johnson'}
Person{id=2, age=30, firstName='Bob', lastName='Smith'}
Person{id=3, age=28, firstName='Charlie', lastName='Brown'}
Person{id=4, age=22, firstName='David', lastName='Wilson'}
Person{id=5, age=35, firstName='Eva', lastName='Miller'}
Person{id=6, age=36, firstName='Sergey', lastName='Emets'}

Deleting person with ID 2

Update person with ID 4

List of person is:
Person{id=1, age=25, firstName='Alice', lastName='Johnson'}
Person{id=3, age=28, firstName='Charlie', lastName='Brown'}
Person{id=4, age=22, firstName='David', lastName='CHANGED'}
Person{id=5, age=35, firstName='Eva', lastName='Miller'}
Person{id=6, age=36, firstName='Sergey', lastName='Emets'}
*/