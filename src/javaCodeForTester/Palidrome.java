package javaCodeForTester;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit: ");
		int num = sc.nextInt();
		int original_num = num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}if(original_num==rev) {
			System.out.println(original_num +"num palindrom");
		}else
		{
			System.out.println(rev+" not pa");
		}

	}

}
