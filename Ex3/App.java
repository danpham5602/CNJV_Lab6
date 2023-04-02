package com.example.cau3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
// create the spring application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // get the bean from spring container
        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        textEditor.input("test release from exercise 3 of lab 6");
        textEditor.save();

        // close the context
        context.close();
    }
}