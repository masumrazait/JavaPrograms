package javaCodeForTester;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String UserInput = sc.nextLine();
		String rev="";
		String orignal=UserInput;
		int len=UserInput.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+UserInput.charAt(i);
		}
		if(orignal.equalsIgnoreCase(rev)) {
			System.out.println(rev + " String is palindrome");
		}else
		{
			System.out.println(rev + " String is not palindrome");
		}
	}	
}