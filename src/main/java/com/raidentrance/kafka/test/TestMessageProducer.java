/**
 * 
 */
package com.raidentrance.kafka.test;

import com.raidentrance.kafka.producer.MessageProducer;

/**
 * @author alex @raidentrance
 *
 */
public class TestMessageProducer {
	public static void main(String[] args) {
		MessageProducer producer = new MessageProducer();
		producer.sendMessage("Hello from Java application");
		producer.close();
	}
}
