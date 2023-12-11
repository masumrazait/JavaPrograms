package practiceJavaCode;

import java.util.Scanner;

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the userInput:");
		
		String userInput=sc.nextLine();
		//1st Way
		/*StringBuilder rev=new StringBuilder(userInput);
		rev.reverse();
		System.out.println(rev);*/
		
		//2nd Way 
		String rev="";
		int len=userInput.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+userInput.charAt(i);
		}
		System.out.println(rev);
		

	}

}
