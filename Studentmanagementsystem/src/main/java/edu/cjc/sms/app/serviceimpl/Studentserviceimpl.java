package edu.cjc.sms.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.repository.Studentrepository;
import edu.cjc.sms.app.servicei.Studentservicei;

@Service
public class Studentserviceimpl implements Studentservicei {

	@Autowired
	Studentrepository sr;
	
	@Override
	public void savedata(Student s) {

     sr.save(s);
		
	}

	

	@Override
	public List<Student> getalldata() {
	
		return (List<Student>) sr.findAll();
	}



	@Override
	public List<Student> getdata() {
		
		return sr.findAll();
	}



	@Override
	public List<Student> searchbybatch(String batchNumber) {
		
		List<Student> batchstudents=sr.findAllByBatchNumber(batchNumber);
		return batchstudents;
	}



	@Override
	public Student getsingledata(int studentId) {
		Optional<Student> op=sr.findById(studentId);
		
		return op.get();
	}



	@Override
	public List<Student> updatestudentfees(int studentId, double ammount) {

      Student s=sr.findById(studentId).get();
      
      s.setFeesPaid(ammount+s.getFeesPaid());
      sr.save(s);
		return sr.findAll();
	}



	
	

	

}
