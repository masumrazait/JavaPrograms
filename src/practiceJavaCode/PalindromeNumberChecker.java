package practiceJavaCode;

import java.util.Scanner;

public class PalindromeNumberChecker {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int rev= 0;
		while(num!=0) {
		rev=rev*10 +num%10;
		num=num/10;}
		
		System.out.println(rev);
	}
}
