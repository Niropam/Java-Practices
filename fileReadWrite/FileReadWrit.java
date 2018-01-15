
/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on displaying information of a file where file information is written 
 * using Scanner class. (FileReader & FileWriter)
 */
package fileReadWrite;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReadWrit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("E:\\Java Practices\\testout.txt");
			FileReader fr =new FileReader("E:\\Java Practices\\testout.txt");
			Scanner str1=new Scanner(System.in);

			System.out.println("Input a String......");
			//String s= str1.nextLine();

			fw.write(str1.nextLine());
			fw.close();
			System.out.println();
			int i;
			System.out.println("The Output after Input... "); 
			while((i=fr.read())!=-1)				
				System.out.print((char)i);			

			fr.close();

		}
		catch(Exception x){
			System.out.println(x);
		}

	}

}

