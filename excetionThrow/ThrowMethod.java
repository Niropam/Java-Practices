/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on determining valid or invalid voter using unchecked exception.
 */
package excetionThrow;
import java.util.Scanner;

public class ThrowMethod {
	 
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		
		VoteClass obj=new VoteClass();
		System.out.print("Plese Input your Age: ");
		System.out.println();
		int age=sc.nextInt();
		{  
			 if(age<18)  
			 throw new NullPointerException("You are not valid voter");  
			 else  
				 obj.voting();
			 }  
		
	}
}
