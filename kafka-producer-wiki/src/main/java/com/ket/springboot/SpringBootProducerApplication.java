package com.ket.springboot;

import com.ket.springboot.producer.WikiChangesProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {

    @Autowired
    private WikiChangesProducer wikiChangesProducer;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class);
    }


    @Override
    public void run(String... args) throws Exception {
        wikiChangesProducer.sendMessage();
    }
}
