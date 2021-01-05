package com.capgemini.service;
import com.capgemini.beans.*;
import java.util.*;
public  class StudentSchedule {
	
	private Student[] studentArr = new Student[10];
	private static int counterStudent=0;
	
	public void addStudent(int rollNo , String name , String[] inputCourses ) {
		
		studentArr[counterStudent++] = new Student ( rollNo , name , inputCourses);
				
	}
	
	public  void showAllStudents() {
		if(counterStudent == 0) 
			System.out.println("No details present\n");
		else {
		for(int i = 0; i < counterStudent ; i++) {
			String[] course2 = studentArr[i].getCourses();
			System.out.println("RollNo : "+ studentArr[i].getRollNo());
			System.out.println("Name : "+ studentArr[i].getName());
			System.out.println("Courses : ");
				System.out.println(Arrays.toString(course2)+"\t");
		}
	  }
	}
	
	public void showStudentByRollNo(int rollNo) {
		if(counterStudent == 0) 
			System.out.println("No details present\n");else {
		for(int i = 0; i < counterStudent  ; i++) {			
		if (studentArr[i].getRollNo() == rollNo) {	
			String[] course2 = studentArr[i].getCourses();
			System.out.println("Name : "+ studentArr[i].getRollNo());
			System.out.println("RollNo : "+ studentArr[i].getName());			
			System.out.println("Courses : ");
				System.out.println(Arrays.toString(course2));
		}
		else
		{
			System.out.println("Entered RollNo is not present\n");
		}
		}
		}
	}
	
	public void showStudentsByCourseName(String courseName) {
		for(int i = 0; i< counterStudent; i++) {
			String[] course2 = studentArr[i].getCourses();
			for(int j = 0; j<course2.length ; j++) {
				if(course2[j].equals(courseName)) {
					System.out.println("RollNo : "+ studentArr[i].getRollNo());
					System.out.println("Name : "+ studentArr[i].getName());
					System.out.println("Courses : ");
						System.out.println(Arrays.toString(course2));
		     }
			}
		}
		
	}
	
	public void showCountByCourse(String courseName) {
		int courseCount= 0;
		for(int i = 0; i< counterStudent; i++) {
			String[] course2 = studentArr[i].getCourses();
			for(int j = 0; j<course2.length ; j++) {
				if(course2[j].equals(courseName)) {
					courseCount++;
					break;
				}
					
			}
		}
		System.out.println("No of students enrolled in "+ courseName + " is " +courseCount);
	}
	public  boolean validation (int rollNo) {	
		for(int j = 0; j < counterStudent ; j++) {
			if(rollNo == studentArr[j].getRollNo()) {
				System.out.println("Roll No already Exist!! Try giving new RollNo..\n");
				return true;
			}
			
	}return false;
}
}
