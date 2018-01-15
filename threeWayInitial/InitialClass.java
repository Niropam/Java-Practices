/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on 3 ways to initialize object. 
 */
package threeWayInitial;

/**
 *
 * @author Niropam
 */

public class InitialClass {
	public String name="It is Showing Object base call.";
	private String gsname;
	
	 
	
	public InitialClass(String cstring) {
		
		System.out.println(cstring);
	}

	public String getName() {
		return gsname;
	}
	
	public void setName(String gsname) {
		this.gsname = gsname;
	}

}
