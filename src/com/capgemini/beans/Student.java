package com.capgemini.beans;

public class Student {
			private int rollNo;
			private String name;
			private String[] courses;
			
			public Student (int rollNo , String name, String[] courses) {
				
				this.rollNo = rollNo;
				this.name = name;
				this.courses = courses;
			}
			
			public int getRollNo() {
				return rollNo;
			}
			public void setRollNo(int rollNo) {
				this.rollNo = rollNo;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String[] getCourses() {
				return courses;
			}
			public void setCourses(String[] courses) {
				this.courses = courses;
			}
			
			
}
