package practiceJavaCode;

import java.util.Scanner;

public class SmallToUperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string : ");
		
		String inputString = sc.nextLine();
		String ConvertedString = inputString.toLowerCase();
		System.out.println(ConvertedString);
	}

}
