package com.example.Payroll;

public class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(Long id){
        super("Employee Not Found "+id);
    }
}
