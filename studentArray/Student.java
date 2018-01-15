/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on input student from keyboard and display student name using array. 
 */
package studentArray;

import java.util.Scanner;

public class Student {
	public String names[];
	public int size,i;

	public void input() {
		System.out.println("How many student?");
		Scanner in = new Scanner(System.in);
		this.size = in.nextInt();
		this.names = new String[size+1];
		System.out.println("Enter all Student Name: ");
		while(i<=size){
			this.names[i] = in.nextLine();
			i++;
		}
		in.close();
	}

	public void printAll() {
		for(i=0;i<size;i++) {
			System.out.println(this.names[i+1]);
			
		}
	}

}
