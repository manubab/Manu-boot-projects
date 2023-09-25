package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.enties.Student;

public interface StudentRepo extends JpaRepository<Student, String> {

}
