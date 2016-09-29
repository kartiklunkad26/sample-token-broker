package io.pivotal;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TokenServiceApplication {

	private final AtomicLong counter = new AtomicLong();
	public static void main(String[] args) {
		SpringApplication.run(TokenServiceApplication.class, args);
	}
	
	@RequestMapping("v1/tokenservice")
	public TokenService getTokenServiceInfo(){
		return new TokenService(counter.incrementAndGet(),String.format("ABCDE123"));
	}
}
