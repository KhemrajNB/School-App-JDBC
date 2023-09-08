package com.school.service;

import java.util.LinkedHashMap;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();
	
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	
	public boolean deleteStudentById(int ID) {
		return studentDao.deleteStudentById(ID);
	}
	
	public int updateStudentById(Student student) {
		return studentDao.updateStudentById(student);
	}
	
	public LinkedHashMap<Integer, Student> retrieveStudentALL() {
		return studentDao.retrieveStudentALL();
	}
}
