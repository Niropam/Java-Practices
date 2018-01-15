/*
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 */
package threeNumCompare;

/**
 *
 * @author Niropam
 */
public class NumberCom {
	public void conversion(int a,int b, int c) {
	    
    if(a>b && a>c){
        System.out.println(a+" is the Large number.");
    }
    else if (b>a && b>c){
        System.out.println(b+" is the Large number.");
    }
    else
        System.out.println(c+" is the Large number.");
		
	}
}
