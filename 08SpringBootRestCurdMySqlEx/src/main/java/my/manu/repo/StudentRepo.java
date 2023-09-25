package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.entity.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer>
{

}
