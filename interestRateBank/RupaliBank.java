/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on showing two banks name and interest rate using interface. 
 */
package interestRateBank;

import java.util.Scanner;

public class RupaliBank implements BankDetails{
	public String name = "Rupali Bank";
	public double amount,interest = 6.25;

	@Override
	public void display() {
		System.out.println("The Bank name: "+this.name+" and Interest Rate: "+this.interest);
		System.out.println("Total Amount after one year you get:"+amount);
		System.out.println("");
		
	}
	public void interest() {
		System.out.println("How much Money you want to Invest in Rupali Bank?");
		Scanner sc= new Scanner(System.in);
		amount= sc.nextDouble();
		amount=amount+(amount*interest);
	}

}
