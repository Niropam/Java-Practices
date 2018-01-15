/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on determining prime/non prime number.
 */
package primeNumber;

/**
 *
 * @author Niropam
 */

public class PrimeNumber {

	public void calculate(int num) {
     boolean flag =false;
     for(int i = 2; i <= num/2; ++i)
     {
         // condition for nonprime number
         if(num % i == 0)
         {
             flag = true;
             break;
         }
     }

     if (!flag)
         System.out.println(num + " is a prime number.");
     else
         System.out.println(num + " is not a prime number.");
		}
	}	
