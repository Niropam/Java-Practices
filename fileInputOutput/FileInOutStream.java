/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on displaying information of a file where file information is written 
 * using Scanner class. (FileInputStream & FileOutputStream)
 */
package fileInputOutput;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class FileInOutStream {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream rd=new FileInputStream("E:\\Java Practices\\testout.txt");
			FileOutputStream fout =new FileOutputStream("E:\\Java Practices\\testout.txt");
			Scanner str1=new Scanner(System.in);

			System.out.println("Input a String......");
			String s= str1.nextLine();
			byte b[]=s.getBytes();
			//fout.write(b);
			System.out.println();
			int i;
			System.out.println("The Output after Input... "); 
			while((i=rd.read())!=-1)				
				System.out.print((char)i);			
			rd.close();
			fout.close();

		}catch(Exception x){
			System.out.println(x);
		}

	}

}
