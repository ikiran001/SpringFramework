package com.in28Minutes.learnspringframework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age,Address address) {};
record Address(String firstline, String secondLine) {};


@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Kiran";
	}
	
	@Bean
	public int age() {
		return 29;
	}
	
	@Primary
	@Bean
	public Person person() {
		return new Person("Jadhav", 30,adress());
	}
	
	@Bean(name="adress2") //customize bean name 
	public Address adress() {
		return new Address("osho rachna","New Panvel");
	}
	@Bean
	public Person person2() {
		return new Person(name(), age(), new Address("Panvel ", "NavI Mumbai"));
	}
	
	@Bean
	public Person person3Parameter(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	
	
	

}
