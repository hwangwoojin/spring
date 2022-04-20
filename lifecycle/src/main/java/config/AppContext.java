package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import client.Client;

@Configuration
public class AppContext {
	
	@Bean
	public Client client() {
		Client client = new Client();
		return client;
	}
}
