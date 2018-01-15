/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on showing company Employees name and salary where Worker class (salary = 2000) 
 * extended by Programmer class with salary increment 3000. (Inheritance) 
 */
package employeeSalary;

/**
 *
 * @author Niropam
 */

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramerSalary obj1=new ProgramerSalary();
		
		obj1.wshow("Kamal",2000, 21);
		System.out.println();
		obj1.pshow("Niropam",23);
	}

}
