/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on 3 ways to initialize object. 
 */
package threeWayInitial;

/**
 *
 * @author Niropam
 */

public class InitialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitialClass obj1=new InitialClass("This is Showing Constructor function.");
		System.out.println();
		System.out.println(obj1.name);
		System.out.println();		
		obj1.setName("This is initial through setter and return via getter.");
		System.out.println(obj1.getName());

	}

}
