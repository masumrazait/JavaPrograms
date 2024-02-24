package javaCodeForTester;

import java.util.Scanner;

public class AddWithSca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		int sa = sc.nextInt();
		int s = Math.max(sa, num);
		System.out.println("greater number is : " + s);

	}

}
