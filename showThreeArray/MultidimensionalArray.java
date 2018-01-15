/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on display Word strings using Three dimension array. 
 */
package showThreeArray;

public class MultidimensionalArray {

	public static void main(String[] args) {
		String arr[][] = {
				{"My ","name "," is ","Niropam"},
				{"I "," Lived ","in ","Bangladesh"},
				{"I "," Love "," my ","motherland"}
		};
		
		for(int i = 0;i<3;i++) {
			for(int j =0; j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
