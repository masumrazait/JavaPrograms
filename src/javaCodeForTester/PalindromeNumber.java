package javaCodeForTester;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int rev=0;
	int orignal_num=num;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	if(orignal_num==rev) {
		System.out.println(orignal_num+" num is palindrom");
		
	}else {
		System.out.println(rev+" num is not palindrom");
	}

	}

}
