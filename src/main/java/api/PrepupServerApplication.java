package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("api.repository")
@SpringBootApplication(scanBasePackages={
"api.controllers", "api.models", "api.service", "api.repository"})
public class PrepupServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PrepupServerApplication.class, args);
	}
	
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	 return builder.sources(PrepupServerApplication.class);
	 }
}
