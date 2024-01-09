package com.datajpa.spring.datajpa;

import com.datajpa.spring.datajpa.Entity.Laptop;
import com.datajpa.spring.datajpa.Entity.Student;
import com.datajpa.spring.datajpa.Repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	private Logger logger= LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student= new Student();
		student.setName("Yasir Ali");
		student.setAbout("Software Engineer");
		student.setStudentId(16);

		Laptop laptop = new Laptop();
		laptop.setBrand("HP");
		laptop.setModel("M-1");
		laptop.setLaptopId(1211);

		//important laptop table manages the student table
		laptop.setStudent(student);
		student.setLaptop(laptop);

		Student savedStudent = studentRepository.save(student);

		logger.info("object ", student.getName());
	}
}
