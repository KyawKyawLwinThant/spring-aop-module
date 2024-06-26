package org.example;

import org.example.service.DoActionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        DoActionService doActionService=context.getBean(DoActionService.class);
        doActionService.doAction();
    }
}