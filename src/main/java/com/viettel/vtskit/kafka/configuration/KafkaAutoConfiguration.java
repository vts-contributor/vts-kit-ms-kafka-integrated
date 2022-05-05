package com.viettel.vtskit.kafka.configuration;

import com.viettel.vtskit.kafka.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(KafkaProperties.class)
public class KafkaAutoConfiguration {

    private KafkaProperties kafkaProperties;

    @Bean
    public KafkaService kafkaService(){
        return new KafkaService();
    }

    @Autowired
    public void setKafkaProperties(KafkaProperties kafkaProperties) {
        this.kafkaProperties = kafkaProperties;
    }
}
