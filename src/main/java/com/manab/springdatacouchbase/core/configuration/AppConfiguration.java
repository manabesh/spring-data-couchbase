package com.manab.springdatacouchbase.core.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Application configuration class
 *
 */

@EnableConfigurationProperties({LocalCouchbaseSetting.class})
public class AppConfiguration {

}

