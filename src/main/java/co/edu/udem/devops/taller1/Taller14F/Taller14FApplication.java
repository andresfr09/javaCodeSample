package co.edu.udem.devops.taller1.Taller14F;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"co.edu.udem.devops"})
public class Taller14FApplication {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		SpringApplication.run(Taller14FApplication.class, args);
	}



}
