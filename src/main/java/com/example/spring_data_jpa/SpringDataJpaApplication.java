package com.example.spring_data_jpa;

import com.example.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);

		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		s1.setRollNo(1);
		s1.setName("David");
		s1.setMarks(90);

		s2.setRollNo(2);
		s2.setName("Jon");
		s2.setMarks(92);

		s3.setRollNo(3);
		s3.setName("Walter");
		s3.setMarks(95);

//		repo.save(s2); for updating also this works
//		repo.save(s3);
//		repo.delete(s3);

		System.out.println(repo.findById(3));

		System.out.println(repo.findByName("David"));

		System.out.println(repo.findByMarksGreaterThan(90));
	}

}
