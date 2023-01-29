package org.pswida.apigateway.servicea;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ServiceAConfiguration {

  @Bean
  public RouteLocator orderProxyRouting(RouteLocatorBuilder builder) {
    return builder.routes()
      .route("Service A Route", r -> r.path("/serviceA/*").uri("http://localhost:8090"))
      .build();
  }

}
