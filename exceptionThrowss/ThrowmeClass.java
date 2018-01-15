/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on handling input-output error using checked exception.(Throws)
 */
package exceptionThrowss;
import java.io.IOException;

public class ThrowmeClass {

		public void trMethod(int num) throws IOException, ClassNotFoundException{ 
			if(num%5<=0)
			{
			throw new IOException("IOException occurred");
			}
			else
			{
			throw new ClassNotFoundException("ClassNotFoundException occured");
			}
		}
}

