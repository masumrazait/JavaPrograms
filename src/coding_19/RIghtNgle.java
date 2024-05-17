package coding_19;

import java.util.Scanner;

public class RIghtNgle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter is row : ");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
