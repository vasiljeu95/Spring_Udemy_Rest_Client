package com.github.vasiljeu95.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * MyConfig
 *
 * @author Stepan Vasilyeu
 * @since 12.09.2022
 */
@Configuration
@ComponentScan("com.github.vasiljeu95")
public class MyConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
