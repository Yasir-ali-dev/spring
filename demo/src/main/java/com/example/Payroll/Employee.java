package com.example.Payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private  String role;
    private String name;

    public Employee(){}

    public Employee(String name, String role){
        this.name=name;
        this.role=role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(role, employee.role) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
