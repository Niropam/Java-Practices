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

public class ProgramerSalary extends WorkerSalary{
	public void pshow(String name, int age) {
		this.name=name;
		long x=salary+3000;
		this.age=age;
		this.position="Programmar";
		System.out.println("Here Mr. " +name+ " age of " +age+ " years working as "+position+" salary is " +x+ "Tk.");
		
	}
}
