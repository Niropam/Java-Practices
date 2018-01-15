/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on GPA based grading system. (Control statement)
 */
package gpaCalculate;

/**
 *
 * @author Niropam
 */

public class GpaCal {
	public void Calculate(float x) {
		float gpa=x;
		
		if(4.00==gpa)  
			System.out.println("Your Grade is A+"); 
		
		else if (3.99<=gpa || gpa>=3.75 )       
			System.out.println("Your Grade is A"); 
		
		else if (3.74<= gpa || gpa >= 3.50)
			System.out.println("Your Grade is A-"); 
		
		else if (3.49<= gpa || gpa >= 3.25)  
			System.out.println("Your Grade is B+"); 
		
		else if (3.24<= gpa || gpa >= 3.00)  
			System.out.println("Your Grade is B");
		
		else if (2.99<= gpa || gpa >= 2.75)  
			System.out.println("Your Grade is B-"); 
	
		else if (2.74<= gpa || gpa >= 2.50)  
			System.out.println("Your Grade is C+"); 
		
		else if (2.49<= gpa || gpa >= 2.00)  
			System.out.println("Your Grade is C"); 
		
		else if (1.99<= gpa || gpa >=1.00)  
			System.out.println("Your Grade is D"); 

		else
			System.out.println("Fail");
		
	}
}
