package practiceJavaCode;

import java.util.Scanner;

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the userInput:");
		
		String userInput=sc.nextLine();
		StringBuilder rev=new StringBuilder(userInput);
		rev.reverse();
		System.out.println(rev);
		

	}

}
