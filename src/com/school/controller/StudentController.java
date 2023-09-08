package com.school.controller;



import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(3);
		student.setName("abc");
		student.setEmail("abc@mail.com");
		
		//=====> Save Student
//		StudentService studentService = new StudentService();
//		Student s = studentService.saveStudent(student);
//		if(s!=null) {
//			System.out.println(s.getId() + " saved successfully");
//		}
		
		//=====> Delete Student
//		StudentService studentService = new StudentService();
//		System.out.println(studentService.deleteStudentById(student.getId()));
		
		
		
		//=====> Update Student
//		StudentService studentService = new StudentService();
//		student.setName("Swastik");
//		System.out.println(studentService.updateStudentById(student));
		
		
		//=====> Retrieve All Data
//		StudentService studentService = new StudentService();
//		studentService.getStudentALL();
		
		
		//=====> Retrieve Data by ID
		StudentService studentService = new StudentService();
		System.out.println(studentService.getStudentById(5));
	}
}
