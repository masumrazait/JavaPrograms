package javaCodeForTester;

import java.util.Scanner;

public class RightAngle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows for the right-angled triangle: ");
		int rows = scanner.nextInt();

		// Outer loop for the number of rows
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
