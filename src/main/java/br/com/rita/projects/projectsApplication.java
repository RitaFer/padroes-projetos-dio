package br.com.rita.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class projectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(projectsApplication.class, args);
	}

}
