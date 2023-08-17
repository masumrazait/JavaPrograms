package practiceJavaCode;

import java.util.Scanner;

public class SwapTwoNumbersUsingtheThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,temp;
		System.out.println("Enter X and Y : ");
		
		Scanner in =new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("Before Swapping : " + x + y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swappping : "+x +y);

	}

}
