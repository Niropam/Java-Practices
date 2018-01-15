/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on Converting a number into HOUR:MINUTE:SECOND.
 */
package numberToHMS;

/**
 *
 * @author Niropam
 */

public class NumToHms {
	public void convert(int x) {
		int Hour=x/3600;
		int Minute=(x/60)%60;
		int Second=(x%60);
		System.out.println(Hour+" Hours:"+Minute+" Minutes:"+Second+" Seconds");
	}

}
