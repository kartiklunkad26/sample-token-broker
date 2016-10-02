package io.pivotal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/v1/tokenservice")
public class TokenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokenServiceApplication.class, args);
	}
	
	@ResponseBody
	@RequestMapping(produces="application/json", value="/{id}", method=RequestMethod.GET)
	public Token getTokenServiceInfo(@PathVariable("id") String id){
		Integer tokenid = Integer.decode(id);
		return new Token(tokenid);
	}
}
