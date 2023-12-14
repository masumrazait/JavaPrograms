package practiceJavaCode;

import java.util.Scanner;

public class LenghtString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString = sc.nextLine();
		int n = inputString.length();
		System.out.println(n);
	}
}
