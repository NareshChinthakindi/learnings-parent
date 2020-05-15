package com.rohinisha;

import com.rohinisha.model.Employee;
import com.rohinisha.model.EmployeeEvent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class SpringReactiveMongoClientApplication {


	@Bean
	WebClient webClient() {
		return WebClient.create("http://localhost:9090/api/employee");
	}

	@Bean
	CommandLineRunner commandLineRunner(WebClient webClient) {


		return strings ->{

			 webClient
					 .get()
					 .uri("/all")
					 .retrieve()
					 .bodyToFlux(Employee.class)
					 .filter(employee -> employee.getFirstname().equals("Naresh"))
					 .flatMap(employee -> {
					 	return  webClient
								.get()
								.uri("/{id}/events", employee.getId())
								.retrieve()
								.bodyToFlux(EmployeeEvent.class);

					 }).subscribe(System.out::println);

			 for (int index = 1; index <=1000; index++) {
				 System.out.println("Blocking "+index);
				 TimeUnit.SECONDS.sleep(3);
			 }

		};

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveMongoClientApplication.class, args);
	}

}
