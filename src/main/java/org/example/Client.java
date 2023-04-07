package org.example;

/**
 * Hello world!
 *
 */
// Java program to illustrate
// the client to perform the
// request to the defined bean

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework
        .context.support
        .ClassPathXmlApplicationContext;

import org.example.HelloWorld;

// Client Class to request the
// above defined bean
public class Client {

    public static void main(String[] args)
    {
        // Load the Spring XML configuration
        // file into IoC container
        ApplicationContext ap = new AnnotationConfigApplicationContext(BeanConfig.class);

        // Get the "HelloWorld" bean object
        // and call getName() method
        HelloWorld Geeks1 = ap.getBean(HelloWorld.class);

        // Set the name
        Geeks1.setName("Geeks1");
        System.out.println(
                "Hello object (hello1)"
                        + " Your name is: "
                        + Geeks1.getName());

        // Get another "HelloWorld" bean object
        // and call getName() method
        HelloWorld Geeks2 = ap.getBean(HelloWorld.class);

        System.out.println(
                "Hello object (hello2)"
                        + " Your name is: "
                        + Geeks2.getName());

        // Now compare the references to see
        // whether they are pointing to the
        // same object or different object
        System.out.println(
                "'Geeks1' and 'Geeks2'"
                        + " are referring"
                        + "to the same object: "
                        + (Geeks1 == Geeks2));

        // Print the address of both
        // object Geeks1 and Geeks2
        System.out.println(
                "Address of object Geeks1: "
                        + Geeks1);
        System.out.println(
                "Address of object Geeks2: "
                        + Geeks2);
    }
}