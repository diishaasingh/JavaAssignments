package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1: launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: configure the things that we want to manage -@Configuration
		//HelloWorldConfiguration - @Configuration
		//name -  @Bean
		
		//3.Retrieving Bean managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("Person2MethodCall"));
		System.out.println(context.getBean("Person3Parameters"));
        System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));


	}

}
