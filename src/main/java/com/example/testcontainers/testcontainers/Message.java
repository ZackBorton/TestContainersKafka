package com.example.testcontainers.testcontainers;

import java.util.Properties;

public class Message implements Producer {

    /**
     * Send a message to kafka
     */
    public void sendMessage()
    {
        // TODO: Pull from properties
        String schemaUrl = "";

        Properties props = new Properties();
        // hardcoding the Kafka server URI for this example
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("key.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer");
        props.put("value.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer");
        props.put("schema.registry.url", schemaUrl);

        String topic = "Information";
    }
}
