package com.school.service;


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
	
	public void getStudentALL() {
		studentDao.getStudentALL();
	}
	
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}
}
