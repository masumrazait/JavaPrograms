package practiceJavaCode;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int x,y,temp;
		System.out.println("Enter X and Y Value:");
		
		Scanner in =new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("before swapping :"+ x+ "and " +y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swaping :"+ x +"and "+y);
	}
}
