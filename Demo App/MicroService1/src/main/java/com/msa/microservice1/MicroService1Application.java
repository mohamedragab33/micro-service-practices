package com.msa.microservice1;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableCircuitBreaker
public class MicroService1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroService1Application.class, args);
    }
@RestController
static
class MicroServiceController{

        @GetMapping("api/msa1/message")
     //   @HystrixCommand(fallbackMethod = "displayDefaultMessage")
        public String displayMessage() {
            return "Hello from MicroService1";
        }
    public String displayDefaultMessage() {
        return "Hello from Default message from  MicroService1";
    }


    }
}
