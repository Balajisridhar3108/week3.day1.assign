package org.student;

import org.college.college;

public class student extends college {
	public static void studentName() {
		System.out.println("student name");
		
	}
	public static void studentDept() {
		System.out.println("student dept");
	}
	public static void studentId() {
		System.out.println("student id");
	}
	public static void main(String[] args) {
		student cl= new student();
		cl.studentDept();
		cl.studentId();
		cl.studentName();
		cl.departmentName();
		cl.collegeName();
		cl.collegeCode();
		cl.collegeRank();
		
	}
		
		
	
}
