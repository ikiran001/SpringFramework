package com.in28Minutes.learnspringframework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class DependencyInjectionAppLauncherAppplication { //launcher class + Configuratin class
	public static void main(String[] args) {
		try(var context=new	AnnotationConfigApplicationContext(DependencyInjectionAppLauncherAppplication.class))
		{	

		}
	}
}

