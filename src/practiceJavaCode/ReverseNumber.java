package practiceJavaCode;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int rev = 0;
		int original=num ;
		//rev number logic
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		//palindrome 
		if(original==rev) {
			System.out.println("number is palindorm "+original );
		}else {
			System.out.println("number is not palindorm "+original );
		}
		//reverse
		System.out.println(rev);

	}
}