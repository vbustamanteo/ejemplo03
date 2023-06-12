package pe.edu.unmsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Ejemplo03Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo03Application.class, args);
	}

}
