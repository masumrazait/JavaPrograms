package javaCodeForTester;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Any word:");
		String userInput=sc.nextLine();
		/* one way
		StringBuilder rev=new StringBuilder(userInput);
		rev.reverse();
		System.out.println(rev);*/
		
		//AnotherWay
		String rev="";
		int len=userInput.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+userInput.charAt(i);
		}
		System.out.println(rev);
	}
}
