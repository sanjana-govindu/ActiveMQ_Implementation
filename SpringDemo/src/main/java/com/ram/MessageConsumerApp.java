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
import com.ram.receiver.MessageReceiver;

// This is a Java program that uses Spring Framework's AnnotationConfigApplicationContext to receive a message using the MessageReceiver class.
public class MessageConsumerApp
{

// In the main method, the program creates a new instance of AnnotationConfigApplicationContext using the AppConfig class as a configuration class. This instructs the context to create and manage all the beans defined in the AppConfig class.
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// The program then retrieves an instance of the MessageReceiver bean from the context using the getBean() method and assigns it to a variable named messageReceiver.
		MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");

		// Next, the program calls the receiveMessage() method on the messageReceiver object to receive a message, and stores the result in a String variable named response.
		String response = messageReceiver.receiveMessage();

		// Finally, the program prints the received message to the console and closes the context.
		System.out.println("Messgae Received = " + response);

		((AbstractApplicationContext) context).close();
	}

}
