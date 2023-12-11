package practiceJavaCode;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		//1st Way
		/*int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse num is:"+rev);*/
		
		//2nd way
		StringBuffer a=new StringBuffer(String.valueOf(num));
		StringBuffer rev=a.reverse();
		System.out.println("Reverse num is:"+rev);

	}

}
