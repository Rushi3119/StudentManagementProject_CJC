package edu.cjc.sms.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.servicei.Studentservicei;

@Controller
public class Admincontroller {

	@Autowired
	Studentservicei ssi;
	
	
	@RequestMapping("/")
	public String prelogin() {
		
		return "login";
	}
	
	@RequestMapping("/LOGIN")
	public String onlogin(@RequestParam("username") String username,@RequestParam("password") String password,Model m) {
		
		if(username.equals("RUSHI") && password.equals("RUSHI123")) {
			List<Student> st=ssi.getdata();
			m.addAttribute("data", st);
			return "adminscrip";
		}
		else {
			m.addAttribute("login_fail", "Enter valid login details.");
			
			return "login";
		}
		
	}
	@RequestMapping("/enroll_student")
	public String savestudent(@ModelAttribute Student s,Model m) {
		
		
		ssi.savedata(s);
		List<Student> st=ssi.getdata();
		m.addAttribute("data", st);
		
		
		return "adminscrip";
	}
	@RequestMapping("/showdata")
	public String showalldata(Model m) {
		List<Student> list=ssi.getalldata();
		m. addAttribute("data", list);

		return "success";
		}
	
	@RequestMapping("/search")
	public String getBatchstudent(@RequestParam("batchNumber") String batchNumber,Model m) {
		
		List<Student> list=ssi.searchbybatch(batchNumber);
		
		if(list.size()>0) {
			m.addAttribute("data", list);
		}
		else {
			List<Student> s=ssi.getalldata();
			m. addAttribute("data", s);
			m.addAttribute("message", "No records are available for the batch '"+batchNumber+"'....!");
		}
		return "adminscrip";
	}
	@RequestMapping("/fees")
	public String onfees(@RequestParam("id") int studentId,Model m) {
		
		Student student=ssi.getsingledata(studentId);
		m.addAttribute("st", student);
		
		return "fees";
	}
	@RequestMapping("/payfees")
	public String updatestudentfees(@RequestParam("studentid") int studentId,@RequestParam("ammount") double ammount,Model m) {
	List<Student> list=	ssi.updatestudentfees(studentId,ammount);
		m.addAttribute("data", list);
		
		return "adminscrip";
	}
	
}
