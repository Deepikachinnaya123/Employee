package com.deepi.EmployeeService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import com.deepi.EmployeeService.Entity.Employee;
import com.deepi.EmployeeService.repo.EmployeeRepository;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class EmployeeServiceApplication {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/create")
    public String save(@RequestBody Employee employee) {
	if(!repository.existsById(employee.getEmployeePKId()))
    {
  		repository.save(employee);
          return  "Saved";
     }
	else
     {
          System.out.println("which is already Exists");
          return "which is already Exists";
      }
    

//    		Employee  result = repository.save(employee);
//    	    return result;
    	
      
    }

   
	@GetMapping("/show")
    public List<Employee> getAll() {
        return repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

}