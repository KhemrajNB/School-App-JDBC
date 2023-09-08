package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
	HelperClass helperclass = new HelperClass();
	Connection connection = null;
	
	public Student saveStudent(Student student) {
		connection = helperclass.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return student;
	}
	
	public boolean deleteStudentById(int ID) {
		connection = helperclass.getConnection();
		String sql = "DELETE FROM student where id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, ID);
			
			int i = preparedStatement.executeUpdate();
			if(i>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}
	
	public int updateStudentById(Student student) {
		connection = helperclass.getConnection();
		String sql = "UPDATE student set name = ?,email = ? where id = ? ";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setInt(3, student.getId());
			
			if(preparedStatement.executeUpdate() > 0) {
				return student.getId();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return 0;
	}
	
	public void getStudentALL() {
//		LinkedHashMap<Integer, Student> lh = new LinkedHashMap<>();
		connection = helperclass.getConnection();
		String sql = "SELECT * FROM student";
//		Student student[] = null;
		ResultSet resultSet = null;
		try {
			Statement statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
//			student = new Student[resultSet.getRow()];
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " +resultSet.getString(2) + " "+ resultSet.getString(3));
				System.out.println("===================================");
				
//				Student s = new Student();
//				s.setId(resultSet.getInt(1));
//				s.setName(resultSet.getString(2));
//				s.setEmail(resultSet.getString(3));
//				lh.put(resultSet.getInt(1), s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		return lh;
	}
	
}
