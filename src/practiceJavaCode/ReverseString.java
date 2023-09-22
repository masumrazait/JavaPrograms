package practiceJavaCode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the User Input:");

		String UserInput = sc.nextLine();
		StringBuilder Reversed=new StringBuilder(UserInput);
		Reversed.reverse();
		System.out.println(Reversed);
		

		
	}

}
