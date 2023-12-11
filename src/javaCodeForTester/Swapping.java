package javaCodeForTester;

import java.util.Scanner;

public class Swapping {
	public static void main(String arg[]) {
		Scanner dc = new Scanner(System.in);
		System.out.println("Enter the x and y val");
		int x=dc.nextInt();
		int y=dc.nextInt();
		int z;
		System.out.println("before swapping "+x +","+y);
		z=x;
		x=y;
		y=z;
		System.out.println("After swapping "+x +","+y);

	}

}
