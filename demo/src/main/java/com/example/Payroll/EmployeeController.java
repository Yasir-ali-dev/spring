package com.example.Payroll;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository){
        this.repository=repository;
    }

    @GetMapping("/employees")
    List <Employee> all(){
        return repository.findAll();
    }
    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id){
        return repository.findById(id).orElseThrow(()-> new EmployeeNotFoundException(id));
    }

    @PostMapping("/employees")
    Employee createEmployee(@RequestBody Employee newEmployee){
        return  repository.save(newEmployee);
    }

    @PutMapping
    Employee updateEmployee (@RequestBody Employee newEmployee, @PathVariable Long id ){
        return repository.findById(id).map((employee)-> {
            employee.setName(newEmployee.getName());
            employee.setRole(newEmployee.getRole());
            return  repository.save(employee);
        }).orElseGet(()->{
            newEmployee.setId(id);
            return  repository.save(newEmployee);
        });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee (@PathVariable Long id){
        repository.deleteById(id);
    }



}
