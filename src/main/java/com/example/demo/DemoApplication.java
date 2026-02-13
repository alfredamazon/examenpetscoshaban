	package com.example.demo;
	
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.Bean;
	import org.springframework.web.client.RestTemplate;
	
	@SpringBootApplication
	public class DemoApplication {
	
		public static void main(String[] args) {
			SpringApplication.run(DemoApplication.class, args);
		}
	
	    // Bean de RestTemplate para hacer llamadas HTTP
	    @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	}
