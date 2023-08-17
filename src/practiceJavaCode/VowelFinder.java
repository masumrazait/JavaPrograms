package practiceJavaCode;

import java.util.Scanner;

public class VowelFinder {

	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word:");
		
		String A=sc.nextLine();
//		String inputString="Hello";
		String vowel="AEIOUaeiou";
		for(char c:A.toCharArray()) {
			if(vowel.indexOf(c)!=-1) {
				System.out.println("Vowel latter is : "+c);
			}
		}
		
	}
}
