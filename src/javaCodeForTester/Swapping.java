package javaCodeForTester;

import java.util.Scanner;

public class Swapping {
	public static void main(String arg[]) {
		Scanner dc = new Scanner(System.in);
		System.out.println("Enter the x and y val");
		int x = dc.nextInt();
		int y = dc.nextInt();
		System.out.println("before swapping the number " + x + " " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("after swapping the number " + x + " " + y);

	}

}
