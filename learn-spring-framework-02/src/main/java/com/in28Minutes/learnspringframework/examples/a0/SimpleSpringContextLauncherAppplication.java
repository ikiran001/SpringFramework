package com.in28Minutes.learnspringframework.examples.a0;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //spring will automaticaly creates beans for us
class YourBussinessClass{

	Dependency1 dependency1;

	Dependency2 dependency2;

	@Autowired
	public YourBussinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		System.out.println("Constructo Ijeton");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	//Setter Injection
	//	@Autowired
	//	public void setDependency1(Dependency1 dependency1) {
	//		System.out.println("SEtter Injetion");
	//		this.dependency1 = dependency1;
	//	}
	//
	//
	//	@Autowired
	//	public void setDependency2(Dependency2 dependency2) {
	//		this.dependency2 = dependency2;
	//	}

	public String toString() {
		return "Using "+dependency1+" and "+dependency2;
	}

}
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherAppplication { //launcher class + Configuratin class
	public static void main(String[] args) {
		try(var context=new	AnnotationConfigApplicationContext(SimpleSpringContextLauncherAppplication.class))
		{	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(YourBussinessClass.class));
		System.out.println(context.getBean(Dependency1.class));
		System.out.println(context.getBean(Dependency1.class));
		System.out.println(context.getBean(Dependency1.class));
		System.out.println(context.getBean(Dependency2.class));
		System.out.println(context.getBean(Dependency2.class));
		}
	}
}

