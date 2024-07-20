package edu.cjc.sms.app.servicei;

import java.util.List;

import edu.cjc.sms.app.model.Student;

public interface Studentservicei {

	void savedata(Student s);

	List<Student> getalldata();

	List<Student> getdata();

	List<Student> searchbybatch(String batchNumber);

	Student getsingledata(int studentId);

	List<Student> updatestudentfees(int studentId, double ammount);


	

}
