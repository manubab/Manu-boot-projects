package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, String> {

}
