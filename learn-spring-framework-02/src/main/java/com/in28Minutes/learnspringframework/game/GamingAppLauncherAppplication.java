package com.in28Minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.in28Minutes.learnspringframework.game")
public class GamingAppLauncherAppplication { //launcher class + Configuratin class
	public static void main(String[] args) {
		try(var context=new	AnnotationConfigApplicationContext(GamingAppLauncherAppplication.class))
		{	
			context.getBean(GamingConsol.class).down();
			context.getBean(GameRunner.class).run();
		}
	}
}
