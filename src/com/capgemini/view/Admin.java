package com.capgemini.view;
import com.capgemini.service.*;
 import java.util.*;
 import java.lang.*;
 
public class Admin {

	private static Scanner sc = new Scanner(System.in);
	private  StudentSchedule stuScheObj = new StudentSchedule();
	
	private void showStudentsByCourseName() {
		System.out.println("Enter course name :\n");
		String courseName = sc.next();
		stuScheObj.showStudentsByCourseName(courseName);
	}
	
	private void showAllStudents() {
		stuScheObj.showAllStudents();
	}
	
	private void showStudentByRollNo() {
		System.out.println("Enter RollNo of the student to be displayed\n");
		int rollNo = sc.nextInt();
		stuScheObj.showStudentByRollNo(rollNo);
	}
	
	private void showCountByCourse() {
		System.out.println("Enter the course name :\n");
		String courseName = sc.next();
		stuScheObj.showCountByCourse(courseName);
	}
	private void addStudent() {
		int rol;
		do {
		System.out.println("Enter Roll No : \n");
		rol = sc.nextInt();
		} while(stuScheObj.validation(rol));
		
		System.out.println("Enter Name : \n");
		String name = sc.next();
		
		System.out.println("How many courses do you want to register?\n");
		int courseCount = sc.nextInt();
		
		String[] inputCourses = new String[courseCount];
		for ( int j = 0 ; j < courseCount; j++) {
			inputCourses[j] = sc.next();
		}
		stuScheObj.addStudent(rol,name,inputCourses);
	}
	
	public static void main(String[] args) {
		int choice;
	
		Admin adminObj = new Admin();
		while(true) {
			System.out.println("Menu ");
			System.out.println("1) Add Student.");
			System.out.println("2) Show all Students.");
			System.out.println("3) Show student details by roll number.");
			System.out.println("4) Show student details by courses.");
			System.out.println("5) Show count by course name.");
			System.out.println("6) Exit");
			System.out.print("Enter your choice: ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : adminObj.addStudent(); 
					 break;
			case 2 : adminObj.showAllStudents();
					 break;
			case 3 : adminObj.showStudentByRollNo(); 
					 break;
	     	case 4 : adminObj.showStudentsByCourseName(); 
				     break;
			case 5 : adminObj.showCountByCourse(); 
					 break;
			case 6 : System.exit(0);
			default : System.out.println("Enter choice between 1 to 6\n");
			
			}
		}
		
		
	}
		
}
	
	
