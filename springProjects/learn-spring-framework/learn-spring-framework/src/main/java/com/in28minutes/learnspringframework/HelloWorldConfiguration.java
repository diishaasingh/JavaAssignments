package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age , Address address) {};

//Address - firstLine, city
record Address(String firstLine,String city) {};

@Configuration //with this annotation we describe that this is our spring annotation class
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Disha";
	}
	
	@Bean
	public int age() {
		return 21;
	}
    @Bean
    public Person person() {
    	return new Person("Ravi",20,new Address("Baker Street","London"));
    }
    @Bean
    public Person Person2MethodCall() {
    	return new Person(name(),age(),new Address("Vimaanagar","Pune"));
    }
    @Bean
    public Person Person3Parameters(String name,int age,Address address2) {
    	return new Person(name,age,address2);
    }
    
    @Bean(name="address2")
    public Address address() {
    	return new Address("Baker Street","London");
    }

}
