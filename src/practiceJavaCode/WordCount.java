package practiceJavaCode;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {

		Scanner cs=new Scanner(System.in);
		System.out.println("Enter the Sentance:");
		String s=cs.nextLine();
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
