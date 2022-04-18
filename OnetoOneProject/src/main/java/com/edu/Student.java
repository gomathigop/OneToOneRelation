package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hibstudent")
public class Student {
	@Id
	int rollno;
	String name;
	int marks;
@OneToOne
Laptop lp;
private int lid;
private String lname;
private float lprice;
	
	public Laptop getLp() {
	return lp;
}
public void setLp(Laptop lp) {
	this.lp = lp;
}
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public float getLprice() {
	return lprice;
}
public void setLprice(float lprice) {
	this.lprice = lprice;
}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", lp=" + lp + ", lid=" + lid
				+ ", lname=" + lname + ", lprice=" + lprice + "]";
	}
	
	
}


