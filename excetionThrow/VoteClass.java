/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on determining valid or invalid voter using unchecked exception.
 */
package excetionThrow;
import java.util.Scanner;

public class VoteClass {
	String[] candidate;
	static int score;
	public void voting() {
		Scanner input = new Scanner(System.in);

		candidate = new String[5];
		candidate[0] = "Choose Your Candidate for *BEST PLAYER* Wisely....\n";
		candidate[1] = "Tamim Iqbal";
		candidate[2] = "Masrafi Bin Mortaza";
		candidate[3] = "Shakib Al Hasan";
		candidate[4] = "Mosfiqur Rahman";

		String userSelect1 = candidate[0];

		if(userSelect1==candidate[0]){
			System.out.println(candidate[0]);
			System.out.println("(A) "+candidate[1]);
			System.out.println("(B) "+candidate[2]);
			System.out.println("(C) "+candidate[3]);
			System.out.println("(D) "+candidate[4]);
			System.out.println();
			System.out.print("Plase Chose your candidate: ");
			String uSelect = input.next();

			switch (uSelect.toUpperCase()){
			case "A":
				uSelect = "Tamim Iqbal";
				System.out.println("Thanks for your Vote.\n\n");
				break;
			case "B":
				uSelect = "Masrafi Bin Mortaza";
				System.out.println("Thanks for your Vote.\n\n");
				break;
			case "C":
				uSelect = "Shakib Al Hasan";
				System.out.println("Thanks for your Vote.\n\n");
				break;
			case "D":
				uSelect = "Mosfiqur Rahman";
				System.out.println("Thanks for your Vote.\n\n");
				break;
			default: 
				uSelect = "None Above\n\n";
				System.out.println("You choose Wrong options.");
				break;
			}

		}
	}

}


