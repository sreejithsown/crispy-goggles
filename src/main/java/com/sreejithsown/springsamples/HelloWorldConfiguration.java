package com.sreejithsown.springsamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}
record Address(String firstLine, String city) {}
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Sree";
		
	}
	@Bean
	public Person person() {
		var person = new Person("Sree", 30);
		return person;
		
	}
	
	@Bean
	public Address address() {
		var address = new Address("70 forestmanor", "Northyork");
		return address;
		
	}

}
