package com.Jpa.M2M.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jpa.M2M.entity.Student;
import com.Jpa.M2M.repository.Courserepository;
import com.Jpa.M2M.repository.Studentrepository;

@RestController
@RequestMapping("/students/courses")
public class StudentCoursesController {
	
	private Studentrepository studentrepository;
	private Courserepository courserepository;
	public StudentCoursesController(Studentrepository studentrepository, Courserepository courserepository) {
		this.studentrepository = studentrepository;
		this.courserepository = courserepository;
	}
	
	
	@PostMapping
	public Student saveStudentWithCourse(@RequestBody Student student) {
		return studentrepository.save(student);
		
	}
	
	@GetMapping 
	public  List<Student> findAllStudents(){
		return studentrepository.findAll();
		
		
		
		
	}
	
	
	
	
	
	
	

}
