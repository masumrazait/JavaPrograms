package javaProgramForTesterFeb;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int temp, x, y;
		System.out.println("Enter the X and Y value:");
		Scanner st = new Scanner(System.in);
		x = st.nextInt();
		y = st.nextInt();
		System.out.println("Before the Swapping number is " + x + " and " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After the Swapping the number is : " + x + " and " + y);

	}

}
