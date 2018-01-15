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
public class CustomerProductsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerProducts obj= new CustomerProducts();
		
		obj.sell(100.00, 500.00);
		obj.sell(100.00, 500.00);
		obj.sell(150,245,177);
		
		obj.displayDetails();

	}

}
