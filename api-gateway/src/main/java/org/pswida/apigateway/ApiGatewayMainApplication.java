package org.pswida.apigateway;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class ApiGatewayMainApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ApiGatewayMainApplication.class, args);
  }

  @Override
  public void run(String... args) {
    log.info("================================================");
    log.info("MICROSERVICES-POC: API GATEWAY");
    log.info("================================================");
  }
}
