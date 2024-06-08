package juneCodingAllProgram;

import java.util.Scanner;

public class TwodifferentStringComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first String : ");
		String FirstStr = sc.nextLine();
		System.out.println("Enter your Second String : ");
		String SecondStr = sc.nextLine();
		if (FirstStr.equalsIgnoreCase(SecondStr)) {
			System.out.println(FirstStr + " and " + SecondStr + " both are the Same");
		} else {
			System.out.println(FirstStr + " and " + SecondStr + " both are not the Same");
		}

	}

}
