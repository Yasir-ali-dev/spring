package com.datajpa.spring.datajpa;

import com.datajpa.spring.datajpa.Entity.*;
import com.datajpa.spring.datajpa.Repository.JobRepository;
import com.datajpa.spring.datajpa.Repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private JobRepository jobRepository;

	private Logger logger= LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// ONE-TO-ONE MAPPING student laptop
		/*

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

		*/

		//	ONE-TO-ONE MAPPING EMPLOYEE JOB
		/*
		Job job = new Job();
		job.setName("Business Analyst ");

		Employee employee=new Employee();
		employee.setName("Kaleem Ahmad ");

		// important
		job.setEmployee(employee);
		employee.setJob(job);

		Job savedJob = jobRepository.save(job);

		logger.info("job : {} ", savedJob.getName());
		*/

		Student student= new Student();
		student.setName("Yasir Ali");
		student.setAbout("Software Engineer");

		Address a1 = new Address();
		a1.setCity("SK");
		a1.setCountry("INDIA");
		a1.setStreet("L1");
		a1.setStudent(student);


		Address a2 = new Address();
		a2.setCity("UK");
		a2.setCountry("INDIA");
		a2.setStreet("S1");
		a2.setStudent(student);

		student.setAddressList(List.of(a1,a2));

		Student savedStudent = studentRepository.save(student);

		logger.info(" student {} ",savedStudent.getAddressList());

	}
}
