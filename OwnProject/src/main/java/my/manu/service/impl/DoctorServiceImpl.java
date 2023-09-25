package my.manu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import my.manu.entity.Doctor;
import my.manu.repo.DoctorRepo;
import my.manu.service.IDoctorService;

public class DoctorServiceImpl implements IDoctorService {

	
	@Autowired
	DoctorRepo repo;
	
	
	
	public String inserData(Doctor doctor) {
		
	Doctor s=repo.save(doctor);
		
		return s.getDoctorId();
	}

	@Override
	public void updateData(Doctor doctor) {
		
		repo.save(doctor);
		
	}

	@Override
	public void deleteData(String doctorId) 
	{
		repo.deleteById(doctorId);
		
	}

	@Override
	public Doctor getData(String doctorId) {
	Doctor doctor=	repo.findById(doctorId).get();
		return doctor;
	}

	@Override
	public Iterable<Doctor> getCompleteDoctorsDetails() {
	Iterable<Doctor> list=repo.findAll();
		return list;
	}

}
