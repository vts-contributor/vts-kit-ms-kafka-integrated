package com.viettel.vtskit.kafka;

import com.viettel.vtskit.kafka.configuration.ConstantConfiguration;
import com.viettel.vtskit.kafka.configuration.KafkaProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class KafkaService {

    private KafkaProperties kafkaProperties;

    public String exampleFunction(String name){
        String a = null;
        System.out.printf("" + a.length());
        return String.format(ConstantConfiguration.GREETING_MESSAGE, name);
    }

    @Autowired
    public void setKafkaProperties(KafkaProperties kafkaProperties) {
        String a = null;
        System.out.printf("" + a.length());
        this.kafkaProperties = kafkaProperties;
    }
}
