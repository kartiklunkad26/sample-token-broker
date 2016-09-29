package io.pivotal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TokenClientApplication {

	 private static final Logger log = LoggerFactory.getLogger(TokenClientApplication.class);
	 
	public static void main(String[] args) {
		SpringApplication.run(TokenClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}
	
	@Bean 
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			Token token = restTemplate.getForObject("http://token-service.local2.pcfdev.io/v1/tokenservice", Token.class);
			log.info(token.toString());
		};
	}
	
	
}
