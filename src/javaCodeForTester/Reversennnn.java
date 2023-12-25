package javaCodeForTester;

import java.util.Scanner;

public class Reversennnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner me = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = me.nextInt();
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

	}
}