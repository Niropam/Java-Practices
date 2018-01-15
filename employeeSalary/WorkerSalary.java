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

public class WorkerSalary {
	String name,position;
	long salary;
	int age;
	
	public void wshow(String name, long salary, int age) {
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.position="Receptionist";
		System.out.println("Here Mr. " +name+ " age of " +age+ " years working as "+position+" salary is " +salary+ "Tk.");
		
	}
	
}
