/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on displaying teacher and student id and name using 
 * method which is overridden from a person class method showiName.(Overridden method)
 */
package showInfo;
/**
*
* @author Niropam
*/
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher obj_t=new Teacher();
		Student obj_s=new Student();
		obj_t.showiName();
		System.out.println();
		obj_s.showiName();
	}

}
