package com.kanlon;


import com.kanlon.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloWorldService = (HelloService)context.getBean("helloWorldService");
        System.out.println(helloWorldService.hashCode());
        helloWorldService.getHelloMessage();

    }
}

