package servlet02;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
@NamedQuery(name="updateQuery", query="update Student s set s.city=:p1 where s.rollNo=:p2")
public class Student {
	@Id
	@GeneratedValue
	private int rollNo;
	private String name;
	private String password;
	private LocalDate dob;
	private String emailId;
	private String city;
	private String gender;
	private String courses;
	public Student(String name, String password, LocalDate dob, String emailId, String city, String gender,
			String courses) {
		super();
		this.name = name;
		this.password = password;
		this.dob = dob;
		this.emailId = emailId;
		this.city = city;
		this.gender = gender;
		this.courses = courses;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public LocalDate getDob() {
		return dob;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getCity() {
		return city;
	}
	public String getGender() {
		return gender;
	}
	public String getCourses() {
		return courses;
	}
	
}
