/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on Fibonacci series. (Loop)
 */
package fibonnacci;

/**
 *
 * @author Niropam
 */

public class Fibonnaci {
	public void calculate(int n) {
		int num1=0,num2=1,num;
		for(int i=1;i<=n;++i) { 
			System.out.print(num1+", ");
			num = num1 + num2;
	        num1= num2;
	        num2 = num;
	       
		}
		
	}

}
