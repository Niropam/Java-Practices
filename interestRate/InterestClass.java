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
public class InterestClass extends AmountClass  {
	public double report() {
		
		double x=5000,y=super.b;
		if(super.a>=5000) {
		return (x*0.05)+(y*0.04);
		}
		else
			return (a*.05);
	}
}
