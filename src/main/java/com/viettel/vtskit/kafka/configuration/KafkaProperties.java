package com.viettel.vtskit.kafka.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;

@ConfigurationProperties(prefix = "kafka")
public class KafkaProperties {

    /**
     * Validate properties at here if necessary
     */
    private void validateProperties(){
        System.out.println("Example Code");
    }

    @PostConstruct
    void init(){
        validateProperties();
    }

}
