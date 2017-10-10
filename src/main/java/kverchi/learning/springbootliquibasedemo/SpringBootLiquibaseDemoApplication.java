package kverchi.learning.springbootliquibasedemo;

import kverchi.learning.controller.InfoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("kverchi.learning")
@EntityScan(basePackages = "kverchi.learning.domain")
@EnableAutoConfiguration
public class SpringBootLiquibaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLiquibaseDemoApplication.class, args);
	}
}
