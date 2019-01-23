package com.learning.spring.spring_five;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.learning.spring.spring_five._interface.MessageProvider;

public class App 
{
    public static void main( String[] args )
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-config.xml");
        ctx.refresh();
        
        MessageProvider messageProvider = ctx.getBean("provider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
