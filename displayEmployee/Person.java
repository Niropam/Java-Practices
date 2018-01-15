/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on displaying employee name and posting area from two interface named 
 * Employee-details and Posting-details. (Multiple Inheritance)
 */
package displayEmployee;

public class Person implements Employee,PostingArea{
	public String name;
	public String postingArea;
	public void Details(String name, String postingArea){
		this.name = name;
		this.postingArea = postingArea;
	}
	@Override
	public String getPostingArea() {
		// TODO Auto-generated method stub
		return this.postingArea;
	}
	@Override
	public String employeeName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
