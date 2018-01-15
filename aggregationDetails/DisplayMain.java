/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on displaying your (name,id) and address (city, district, post code,country) using aggregation.
 */
package aggregationDetails;

/**
 *
 * @author Niropam
 */

public class DisplayMain {

	public static void main(String args[]){
	       AddressInfo ad = new AddressInfo("Brahmanbaria", "Chittagong", "Bangladesh",3400);
	       PersonalInfo obj = new PersonalInfo(0044, "Niropam Das", ad);
	       System.out.println("...Here is some different output using aggregation...");
	       System.out.println("Name :"+obj.name+" ID:"+obj.id+" & City:"+obj.personAddr.city);
	       //This line use aggregation.
	       System.out.println();
	       System.out.println("City:"+obj.personAddr.city+" Division:"+obj.personAddr.state+" & Country:"+obj.personAddr.country);
	       //This line use normal object and aggregation call.
	       System.out.println();
	       System.out.println("Postal Code:"+ad.postCode+" Again Postal Code:"+obj.personAddr.postCode+" Name:"+obj.name);
	   }
	

}
