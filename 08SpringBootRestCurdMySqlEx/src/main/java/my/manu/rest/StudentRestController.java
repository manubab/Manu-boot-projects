package my.manu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.manu.entity.Student;
import my.manu.exception.StudentNotFoundException;
import my.manu.handler.IStudentService;

@RestController
@RequestMapping("/std")
public class StudentRestController {
	@Autowired
	private IStudentService service;

	@PostMapping("/create")
	public ResponseEntity<String> createStudent(

			@RequestBody Student student) {
		Integer id = service.saveStdent(student);
		String message = "Student '" + id + "'+ceated";
		return new ResponseEntity<String>(message, HttpStatus.CREATED);

	}

	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents() {

		List<Student> list = service.getAllStudents();

		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);

	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Student> getOneStudent(@PathVariable("id") Integer id) {
		ResponseEntity<Student> response = null;

		try {
			Student s = service.getOneStudent(id);

			response = ResponseEntity.ok(s);

		} catch (StudentNotFoundException e) {
			e.printStackTrace();
			throw e;
		}

		return response;
	}

	@GetMapping("/remove/{id}")
	public ResponseEntity<String> deleteStudent9(@PathVariable("id") Integer id) {
		ResponseEntity<String> response = null;

		try {
			service.deleteStudent(id);

			response = ResponseEntity.ok("Student '" + id + "'Removed ");

		} catch (StudentNotFoundException e) {
			e.printStackTrace();
			throw e;

		}

		return response;
	}

	@PutMapping("/modify")
	public ResponseEntity<String> updateStudent(@RequestBody Student student) {

		ResponseEntity<String> response = null;

		try {

			service.updateStudent(student);

			response = ResponseEntity.ok("student '" + student.getSid() + "' modifyied ");
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
			throw e;
		}

		return response;
	}

	private ResponseEntity<String> ResponseEntity(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
