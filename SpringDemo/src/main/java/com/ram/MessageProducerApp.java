// SWE 645 Extra Credit Assignment - Implementation of Active MQ
// Abhishek Veeravalli | G01391003
// Anurag Peddi | G01394826
// Bhaskar Praveen | G01382027
// Ramya Sree Avula | G01395493
// Aditee Gaddam | G01363937
// Sanjana Govindu | G01380306

package com.ram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ram.config.AppConfig;
import com.ram.producer.MessageSender;

// This is a Java program that uses Spring Framework's AnnotationConfigApplicationContext to send a message using the MessageSender class.
// The program starts by importing the necessary classes, including AnnotationConfigApplicationContext and AbstractApplicationContext from the Spring Framework, and AppConfig and MessageSender from the project's codebase.
public class MessageProducerApp
{

	//In the main method, the program creates a new instance of AnnotationConfigApplicationContext using the AppConfig class as a configuration class. This instructs the context to create and manage all the beans defined in the AppConfig class.
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// The program then retrieves an instance of the MessageSender bean from the context using the getBean() method and assigns it to a variable named messageSender.
		MessageSender messageSender = context.getBean(MessageSender.class);

		// Next, the program calls the sendMessage() method on the messageSender object to send a message, with the message content passed as an argument.
		messageSender.sendMessage("Hi Everyone, How are you?");

		// Finally, the program prints a success message to the console and closes the context.
		System.out.println("Message has been sent successfully...");

		((AbstractApplicationContext) context).close();
	}

}
