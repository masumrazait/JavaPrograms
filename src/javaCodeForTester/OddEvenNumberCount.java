package javaCodeForTester;

import java.util.Scanner;

public class OddEvenNumberCount {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int even_count = 0;
		int odd_count = 0;
		while (num > 0) {
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
			num=num/10;
			
		}
		System.out.println("Even number count: " + even_count);
		System.out.println("Odd number count: " + odd_count);
	}
}
