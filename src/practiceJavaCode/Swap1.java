package practiceJavaCode;

import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		System.out.println("Enter the A and B values:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before the Swapping:" + a + "and " + b);
		//first way
		/*c = a;
		a = b;
		b = c;
		System.out.println("After the Swapping:" + a + "and " + b);*/
		
		// 2nd way 
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After the Swapping:" + a + "and " + b);*/
		
		//3rd way
		/*a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After the Swapping:" + a + "and " + b);*/
		
		//4th way
		b=a+b-(a=b);
		System.out.println("After the Swapping:" + a + "and " + b);
		
		

	}

}
