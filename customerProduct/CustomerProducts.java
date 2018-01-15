/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on finding total customer, total sold product 
 * and total sell amount of a shop. (Overloading method, Static)
 */
package customerProduct;

/**
 *
 * @author Niropam
 */
public class CustomerProducts {
	public static int product,customer;
	public static double amount = 0.0;
	
	public void sell(double p1, double p2) {
		product=product+2;
		amount = amount + p1 + p2;
		customer++;
	}
	
	public void sell(int p1, int p2, int p3) {
		product=product+3;
		amount = amount + p1 + p2 + p3;
		customer++;
	}
	
	public void displayDetails() {
		System.out.println("Total Selling Product = "+ product);
		System.out.println("Total Amount of Sale = "+ amount);
		System.out.println("Total Customer = "+ customer);

	}


}
