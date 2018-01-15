/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on displaying student name and GPA using 
 * abstract method showName and non-abstract method showGPA. (Abstract class)
 */
package gpaShow;

import java.util.Scanner;

public class Student extends AbstractClass {
	public void showName() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("What is the name?");
		
		name=sc.nextLine();
		System.out.println("The name of student : "+name);
		
	}

	
}
