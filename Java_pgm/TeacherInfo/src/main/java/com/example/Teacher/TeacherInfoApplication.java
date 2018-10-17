package com.example.Teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeacherInfoApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(TeacherInfoApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner studentDemo(StudentRepository srepository,  TeacherRepository trepository) {
//		return (args) -> {
//			TeacherInfo user1 = new TeacherInfo("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
//			trepository.save(user1);
//	    	
//	        srepository.save(new StudentInfo("John", "Johnson", "10"));
//	        srepository.save(new StudentInfo("Mary", "Poppins", "9"));
//	        srepository.save(new StudentInfo("Rob", "Robber", "8"));
//	        srepository.save(new StudentInfo("Kate", "Robinson", "10"));
//	    };
//	}	
}
