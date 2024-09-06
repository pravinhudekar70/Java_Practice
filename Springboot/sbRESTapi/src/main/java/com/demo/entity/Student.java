package com.demo.entity;

public class Student {
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;
	public int getSid() {
		return sid;
	}
	public Student setSid(int sid) {
		this.sid = sid;
		return this;
	}
	public String getSname() {
		return sname;
	}
	public Student setSname(String sname) {
		this.sname = sname;
		return this;
	}
	public String getScity() {
		return scity;
	}
	public Student setScity(String scity) {
		this.scity = scity;
		return this;
	}
	public double getSpercentage() {
		return spercentage;
	}
	public Student setSpercentage(double spercentage) {
		this.spercentage = spercentage;
		return this;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage + "]";
	}
	
	

}
