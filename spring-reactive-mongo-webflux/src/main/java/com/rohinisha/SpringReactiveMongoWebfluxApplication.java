package com.rohinisha;

import com.rohinisha.model.Employee;
import com.rohinisha.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringReactiveMongoWebfluxApplication {


    @Bean
	CommandLineRunner employees(EmployeeRepository repository) {

    	return args -> {

    		repository.deleteAll().subscribe(null, null, () ->{

				Stream.of(new Employee(UUID.randomUUID().toString(), "Naresh", "Suresh"),
						new Employee(UUID.randomUUID().toString(), "Ram", "Raghavu"),
						new Employee(UUID.randomUUID().toString(), "Ranjith", "Kiran"),
						new Employee(UUID.randomUUID().toString(), "Tharun", "Rat")
						).forEach(employee -> {
							repository.save(employee).subscribe(System.out::println);
				});


			});

		};

	}


	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveMongoWebfluxApplication.class, args);
	}

}
