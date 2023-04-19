package com.in28Minutes.learnspringframework.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//launch spring context
		//Spring
		try(var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			//Configure the things that we want spring to manage.@configuration
			//HellowWorldConfiguration - @Configuration
			//name-@Bean
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("adress2"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3Parameter"));
		}
	}
}
