/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on determining total interest for 8000tk 
 * where 5% interest till 5000 and 4% interest above 5000.(Super)
 */
package interestRate;
/**
*
* @author Niropam
*/
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestClass obj=new InterestClass();
		obj.getAmount(4000);
		System.out.println("The total amount is = "+obj.a+" and its total interest is ="+obj.report());
		
		
	}

}
