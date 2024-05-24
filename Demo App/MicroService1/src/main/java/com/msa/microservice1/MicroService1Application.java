package com.msa.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MicroService1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroService1Application.class, args);
    }
@RestController
    class MicroServiceController{

        @GetMapping("api/msa1/message")
        public String displayMessage() {
            return "Hello from MicroService1";
        }

    }
}
