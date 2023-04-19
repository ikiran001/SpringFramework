package com.in28Minutes.learnspringframework.examples.C1;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherAppplication { //launcher class + Configuratin class
	public static void main(String[] args) {
		try(var context=new	AnnotationConfigApplicationContext(RealWorldSpringContextLauncherAppplication.class))
		{	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(BussineessLogicService.class).findMax());
		}
	}
}

