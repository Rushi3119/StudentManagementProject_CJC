package edu.cjc.sms.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String studentFullName;
	private String studentEmail;
	private byte studentAge;
	private String studentCollagename;
	private double feesPaid;
	private String studentCourse;
	private String batchmode;
	private String batchNumber;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFullName() {
		return studentFullName;
	}
	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public byte getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(byte studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentCollagename() {
		return studentCollagename;
	}
	public void setStudentCollagename(String studentCollagename) {
		this.studentCollagename = studentCollagename;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public String getBatchmode() {
		return batchmode;
	}
	public void setBatchmode(String batchmode) {
		this.batchmode = batchmode;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	
	
	
}