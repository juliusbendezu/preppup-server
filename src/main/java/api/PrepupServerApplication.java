package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("api.controllers")
@SpringBootApplication
public class PrepupServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PrepupServerApplication.class, args);
	}
	
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	 return builder.sources(PrepupServerApplication.class);
	 }
	 
	 // hola amigo igen
	 // hej igen 
	 
	 //Syns den här?
	 
}
