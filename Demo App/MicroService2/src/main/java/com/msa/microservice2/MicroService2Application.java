package com.msa.microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroService2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroService2Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @RestController
    public class MicroService2Controller{

        @Autowired
        private RestTemplate m_restTemplate;

        @GetMapping("api/msa2/message")
        public String getMS1Message(){
            return m_restTemplate.getForObject("http://localhost:9091/api/msa1/message", String.class);
        }


    }




}
