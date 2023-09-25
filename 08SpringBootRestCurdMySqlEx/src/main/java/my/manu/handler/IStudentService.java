package my.manu.handler;

import java.util.List;

import my.manu.entity.Student;

public interface IStudentService 
{
	Integer saveStdent(Student s);
	
	void updateStudent(Student s);
	
	void deleteStudent(Integer id);
    
	Student getOneStudent(Integer id);
	
	List<Student> getAllStudents();
	
	
	
	
}
