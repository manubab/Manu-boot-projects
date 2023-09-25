package my.manu.service;

import org.springframework.stereotype.Service;

import my.manu.entity.Doctor;

@Service
public interface IDoctorService 
{
	
	String inserData(Doctor doctor);
	
	 void updateData(Doctor doctor);
	 
	 void deleteData(String doctorId);
	 
	 Doctor getData(String doctorId);
	 
	 Iterable<Doctor> getCompleteDoctorsDetails();
	 
	 

}
