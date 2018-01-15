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
public class Student extends Persons {
	public void showiName() {
		name="Niropam";
		id=160044;
		System.out.println("The name of Student:"+name +" & his/her id:"+id);
	}
}
