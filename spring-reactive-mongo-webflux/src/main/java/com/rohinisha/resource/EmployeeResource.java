package com.rohinisha.resource;


import com.rohinisha.model.Employee;
import com.rohinisha.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/employee")
public class EmployeeResource {


    private EmployeeRepository repository;

    @GetMapping("/all")
    public Flux<Employee> getAllEmployees() {
        return repository.findAll();
    }
}
