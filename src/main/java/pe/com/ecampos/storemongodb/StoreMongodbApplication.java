package pe.com.ecampos.storemongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class StoreMongodbApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(StoreMongodbApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				//registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:8080");
				registry.addMapping("/**").allowedOrigins("https://vast-gorge-47704.herokuapp.com");
			}
		};
	}
 
}
