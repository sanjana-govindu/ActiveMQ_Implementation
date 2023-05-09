# SWE645-ActiveMQ_Implementation

**Installation of ActiveMQ:**
Download ActiveMQ from the given link:
https://activemq.apache.org/components/classic/download/

Start ActiveMQ by going the ActiveMQ bin directory and use “activemq start” command to start activeMQ. We can Access ActiveMQ at http://localhost:8161/ in your browser. It would ask a dialogue box with username and password which are both “admin” Then we will be directed to ActiveMQ Dashboard
  
Creating Message Configuration Class: In the above given configuration class: We have provided activemq broker url. We have created jms template object by using connectionfactory object and the message queue. We can send and receive message from the queue using the jms template
 
Message Sender and Message Receiver Class: The sendMessage method in MessageSender class is responsible for sending messages to the queue
 
- The recieveMessage method in MessageReciever class is responsible for receiving messages to the queue
- The messageConverter in receiveMessage method is for converting java object to jms message and jms message to java object

Message Producer class: The messagesender object in the message producer class is used for sending messages to the queue. You can see the message sent in the message details given above

Message Consumer class: This class is used for receiving messages from the queue. So, the message has been received now, so there are no more pending messages and there is one Dequeued message This is a Basic implementation of Active MQ.

**REFERENCES:**
- https://aws.amazon.com/ec2/instance-types/
- https://www.tutorialspoint.com/inter_process_communication/inter_process_communication_message_queues.htm
- https://activemq.apache.org/
- https://activemq.apache.org/producer-flow-control
- https://www.tutorialspoint.com/apache_activemq/apache_activemq_consumer_application.htm
         
