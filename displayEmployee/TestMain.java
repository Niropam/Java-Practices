/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on displaying employee name and posting area from two interface named 
 * Employee-details and Posting-details. (Multiple Inheritance)
 */
package displayEmployee;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person();
		System.out.println("Enter the Name fist Then Posting Area.");
		Scanner sc=new Scanner(System.in);
		obj.name=sc.nextLine();
		obj.postingArea=sc.nextLine();
		System.out.println();
		System.out.println("Name: "+obj.employeeName());
		System.out.println("Posting Area: "+obj.getPostingArea());
		

	}

}
