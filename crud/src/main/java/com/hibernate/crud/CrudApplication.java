package com.hibernate.crud;

import com.hibernate.crud.DAO.StudentDAO;
import com.hibernate.crud.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner{

	@Autowired
	private StudentDAO studentDAO;
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("play");

		Student tempStudent = new Student( );
		tempStudent.setEmail("yasir@gmail.com");
		tempStudent.setFirstName("Yasir");
		tempStudent.setLastName("Ali");
		studentDAO.save(tempStudent);

		System.out.println(tempStudent.getId());

	}
}
