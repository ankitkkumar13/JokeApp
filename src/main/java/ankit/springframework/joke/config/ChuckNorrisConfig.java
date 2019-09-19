package ankit.springframework.joke.config;

import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckNorrisConfig {
//	ChuckNorrisQuotes chuckNorrisQuotes;

//	@Bean
	public ChuckNorrisQuotes getQuotes() {
		return new ChuckNorrisQuotes();
	}

}
