package org.pswida.servicea;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class ServiceAMainApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ServiceAMainApplication.class, args);
  }

  @Override
  public void run(String... args) {
    log.info("================================================");
    log.info("MICROSERVICES-POC: SERVICE A");
    log.info("================================================");
  }
}
