package practiceJavaCode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String inputString=sc.nextLine();
		StringBuilder ReversedString=new StringBuilder(inputString);
		ReversedString.reverse();
		System.out.println(ReversedString);
	}

}
