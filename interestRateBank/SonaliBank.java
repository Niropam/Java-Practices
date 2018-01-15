/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on showing two banks name and interest rate using interface. 
 */
package interestRateBank;

import java.util.Scanner;

public class SonaliBank implements BankDetails {
	public String name = "Sonali Bank";
	public double amount,interest = 5.75;

	@Override
	public void display() {
		System.out.println("The Bank name: "+this.name+" and Interest Rate: "+this.interest);
		System.out.println("Total Amount after one year you get:"+amount);
		System.out.println("");
	}
	public void interest() {
		System.out.println("How much Money you want to Invest in Sonali Bank?");
		Scanner sc= new Scanner(System.in);
		amount= sc.nextDouble();
		amount=amount+(amount*interest);
	}

}
