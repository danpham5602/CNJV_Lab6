package com.example.cau1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Product propertyProduct = context.getBean("myPropertyProduct", Product.class);
        Product alphaPropertyProduct = context.getBean("myPropertyProduct", Product.class);
        Product constructorArgProduct = context.getBean("myConstructorArgProduct", Product.class);
        Product alphaConstructorArgProduct = context.getBean("myConstructorArgProduct", Product.class);
        Product singletonProduct = context.getBean("mySingletonProduct", Product.class);
        Product alphaSingletonProduct = context.getBean("mySingletonProduct", Product.class);

        System.out.println(propertyProduct.getId());
        System.out.println(propertyProduct.getName());
        System.out.println(propertyProduct.getDescription());

        System.out.println(constructorArgProduct.getId());
        System.out.println(constructorArgProduct.getName());
        System.out.println(constructorArgProduct.getDescription());

        System.out.println(singletonProduct.getId());
        System.out.println(singletonProduct.getName());
        System.out.println(singletonProduct.getDescription());

        boolean result1 = propertyProduct == alphaPropertyProduct;
        boolean result2 = constructorArgProduct == alphaConstructorArgProduct;
        boolean result3 = singletonProduct == alphaSingletonProduct;

        System.out.println("First bean: Pointing to the same instance " + result1);
        System.out.println("Second bean: Pointing to the same instance " + result2);
        System.out.println("Third bean: Pointing to the same instance " + result3);

        context.close();
    }
}
