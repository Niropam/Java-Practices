/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on various variable adder system. (Constructor overloading)
 */
package variousAdder;

/**
 *
 * @author Niropam
 */

public class ConstractorClass {
	public int x,y,z,result;
	public float p,q,r,s,fresult;
	
	public ConstractorClass(int x, int y) {
		
		this.x = x;
		this.y = y;
		result=x+y;
		System.out.println("The Result is:"+result);
	}

	public ConstractorClass(int x, int y, int z) {
	
		this.x = x;
		this.y = y;
		this.z = z;
		result=x+y+z;
		System.out.println("The Result is:"+result);
	}

	public ConstractorClass(float p, float q, float r) {
	
		this.p = p;
		this.q = q;
		this.r = r;
		fresult=p+q+r;
		System.out.println("The Result is:"+fresult);
	}

	protected ConstractorClass(float p, float q, float r, float s) {

		this.p = p;
		this.q = q;
		this.r = r;
		this.s = s;
		fresult=p+q+r+s;
		System.out.println("The Result is:"+fresult);
	}
	
	
	

}
