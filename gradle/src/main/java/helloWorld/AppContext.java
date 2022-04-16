package helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	@Bean
	public Hello hello() {
		Hello hello = new Hello();
		return hello;
	}
}
