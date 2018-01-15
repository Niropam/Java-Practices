/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on factorial of a number. (Recursion)
 */
package factorial;

/**
 *
 * @author Niropam
 */

public class Factorial {
	public int factorialc(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return (num*factorialc(num-1));
		}
	}
}
