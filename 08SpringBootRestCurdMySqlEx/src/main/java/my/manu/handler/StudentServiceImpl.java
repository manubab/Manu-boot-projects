package my.manu.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.manu.entity.Student;
import my.manu.exception.StudentNotFoundException;
import my.manu.repo.StudentRepo;


@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public Integer saveStdent(Student s) {
      s=repo.save(s);
		return s.getSid();
	}
	@Override
	public void updateStudent(Student s) {
		if(s.getSid()==null||!repo.existsById(s.getSid()))
		{
			throw new StudentNotFoundException("Student '"+s.getSid()+"'not exist");
		}
		else
			repo.save(s);
	}
	@Override
	public void deleteStudent(Integer id) {
		repo.delete(getOneStudent(id));
	}
	@Override
	public Student getOneStudent(Integer id) {
		
		return repo.findById(id).orElseThrow(()->new StudentNotFoundException("Stdent '"+ id+ "' not exist " ));
	}
	@Override
	public List<Student> getAllStudents() {	
	List<Student> list=	repo.findAll();
		return list;
	}

}
