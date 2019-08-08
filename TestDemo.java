package assignment4;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {

		//See if positive, negative, or zero and print ascii
		int n = Integer.parseInt(args[0]);
		if (n == 0) {
			System.out.println("You Have Entered Zero. ASCII value of " + n + " is " + getASCII(n));
		} else if (n > 0){
			System.out.println("You Have Entered Positive Value. ASCII value of " + n + " is " + getASCII(n));
		} else {
			System.out.println("You Have Entered Negative Value. ASCII value of " + n + " is " + getASCII(n));
		}
		
		System.out.println();
		
		//Print Grade
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter grade: ");
		int g = sc.nextInt();
		System.out.println(g + " is " + getGrade(g) + "\n");
		
		//Print Average PCM
		System.out.print("Enter chemistry grade: ");
		int c = sc.nextInt();
		System.out.print("Enter physics grade: ");
		int p = sc.nextInt();
		System.out.print("Enter math grade: ");
		int m = sc.nextInt();
		
		sc.close();
		
		int avg = (c + p + m) / 3;
		
		System.out.println("Average is " + avg + ". Grade is " + getGrade(avg));
	}
	
	static String getASCII(int num) {
		String str = String.valueOf(num);
		String ascii = "";
		for (int i = 0; i < str.length(); i++) {
			ascii += String.valueOf((int)str.charAt(i)) + " ";
		}
		return ascii;
	}
	
	static char getGrade(int num) {
		if (num > 70) {
			return 'A';
		} else if (num > 60) {
			return 'B';
		} else {
			return 'C';
		}
	}

}
