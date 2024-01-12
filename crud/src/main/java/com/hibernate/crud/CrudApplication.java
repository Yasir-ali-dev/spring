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
		System.out.println(studentDAO.findByLastName("Hassan"));
	}

	public void createStudent (Student student){
		studentDAO.save(student);
		System.out.println(student.getId());

	}


	public void createMultipleStudent (){
		Student student1 = new Student("Hassan","Ali","hasssan@gmail.com");
		Student student2 = new Student("Hussain","Ali","hussain@yahoo.com");
		Student student3 = new Student("Haider","Ali","haider@gmail.com");

		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);

	}
}
