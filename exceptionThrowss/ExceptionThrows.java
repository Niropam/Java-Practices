/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on handling input-output error using checked exception.(Throws)
 */
package exceptionThrowss;
import java.io.IOException;
import java.util.Scanner;

import exceptionThrowss.ThrowmeClass;

public class ExceptionThrows {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ThrowmeClass obj = new ThrowmeClass();
		System.out.println("Enter an Integer Number (1 to 100).....");
		int x= sc.nextInt();
		obj.trMethod(x);

	}

}
