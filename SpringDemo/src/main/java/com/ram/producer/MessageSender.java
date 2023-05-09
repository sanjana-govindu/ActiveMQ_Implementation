// SWE 645 Extra Credit Assignment - Implementation of Active MQ
// Abhishek Veeravalli | G01391003
// Anurag Peddi | G01394826
// Bhaskar Praveen | G01382027
// Ramya Sree Avula | G01395493
// Aditee Gaddam | G01363937
// Sanjana Govindu | G01380306

package com.ram.producer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender
{

	@Autowired
	JmsTemplate jmsTemplate;

	public void sendMessage(final String message)
	{

		jmsTemplate.send(new MessageCreator()
		{
			public Message createMessage(Session session) throws JMSException
			{
				ObjectMessage objectMessage = session.createObjectMessage(message);
				return objectMessage;
			}
		});
	}

}
