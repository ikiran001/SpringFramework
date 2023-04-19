package com.in28Minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28Minutes.learnspringframework.game.GameRunner;
import com.in28Minutes.learnspringframework.game.GamingConsol;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(	var context=new	AnnotationConfigApplicationContext(GamingConfiguration.class))
		{	
			context.getBean(GamingConsol.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
