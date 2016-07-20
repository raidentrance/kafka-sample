/**
 * 
 */
package com.raidentrance.kafka.test;

import com.raidentrance.kafka.consumer.MessageConsumer;

/**
 * @author alex @raidentrance
 *
 */
public class TestMessageConsumer {
	public static void main(String[] args) {
		MessageConsumer consumer=new MessageConsumer();
		consumer.start();
	}
}
