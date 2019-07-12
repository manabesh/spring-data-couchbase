package com.manab.springdatacouchbase.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Entry Point class
 * 
 * https://docs.spring.io/spring-boot/docs/current/reference/html/howto-traditional-deployment.html
 *
 */

@SpringBootApplication
public class EntryPoint extends SpringBootServletInitializer {

  protected static final Logger LOGGER = LoggerFactory.getLogger(EntryPoint.class);

  public static void main(String[] args) {
    LOGGER.info("Initializing Spring Boot!");
    SpringApplication.run(EntryPoint.class, args);
  }

}
