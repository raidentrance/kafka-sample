/**
 * 
 */
package com.raidentrance.kafka.producer;

import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

/**
 * @author alex @raidentrance
 *
 */
public class MessageProducer {

	private Producer<String, String> producer;

	private final static String TOPIC = "javatest";

	public void buildProducer() {
		Properties props = new Properties();
		props.put("metadata.broker.list", "localhost:9092");
		props.put("serializer.class", "kafka.serializer.StringEncoder");
		ProducerConfig config = new ProducerConfig(props);
		producer = new Producer<>(config);
	}

	public void sendMessage(String message) {
		KeyedMessage<String, String> msg = new KeyedMessage<String, String>(TOPIC, message);
		producer.send(msg);
	}

	public void close() {
		producer.close();
	}

}
