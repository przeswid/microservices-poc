package org.pswida.servicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
class ServiceAController {

  @GetMapping("/hello")
  String serviceAHello() {
    return "Service A returns Hello!";
  }
}
