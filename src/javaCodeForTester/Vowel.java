

	package javaCodeForTester;
	
	import java.util.Scanner;
	
	public class Vowel {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the word:");
			String UserInput = sc.nextLine();
			String vowel = "A E I O U a e i o u";
			for (char c : UserInput.toCharArray()) {
				if (vowel.indexOf(c)!=-1) {
					System.out.println(c);
				}
			}
		}
	}

	
	
	