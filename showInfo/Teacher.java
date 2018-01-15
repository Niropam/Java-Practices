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
public class Teacher extends Persons {
	public void showiName() {
		name="Ismile";
		id= 160001;
		System.out.println("The name of Teacher:"+name +" & his/her id:"+id);

	}
}
