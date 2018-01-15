/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on showing two banks name and interest rate using interface. 
 */
package interestRateBank;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SonaliBank sb = new SonaliBank();
		RupaliBank rb = new RupaliBank();
		sb.interest();
		sb.display();
		rb.interest();
		rb.display();

	}

}
