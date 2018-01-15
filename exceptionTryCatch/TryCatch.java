/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on exception handling using try-catch-finally.
 */
package exceptionTryCatch;

public class TryCatch {

	   public static void main(String args[]) {
	      try {
	         int arry[] = {23,15,73,87,43};
	         System.out.println("Access element of the array position :" + arry[3]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println();
	      System.out.println("This is the END OF THE JAVA!!! Just Kidding...:)");
	   }
}
