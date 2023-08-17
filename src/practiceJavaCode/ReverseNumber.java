package practiceJavaCode;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int orignal_num=num;
		int rev = 0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orignal_num==rev) {
			System.out.println(orignal_num+ " Number is palindrom");
		}else {
			System.out.println(orignal_num+ " Number is not palindrom");
		}
	}
}