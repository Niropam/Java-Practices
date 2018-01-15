/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on displaying student name and GPA using 
 * abstract method showName and non-abstract method showGPA. (Abstract class)
 */
package gpaShow;

import java.util.Scanner;

abstract class AbstractClass {
	public String name;
	public float GPA;
	
	public abstract void showName();
	
	public void showGPA() {
		System.out.println("*******************");
		Scanner sc= new Scanner(System.in);
		System.out.println("What is the GPA?");
		
		GPA=sc.nextFloat();
		System.out.println("The G.P.A : "+GPA);
	}
}
