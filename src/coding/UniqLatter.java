package coding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqLatter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String userinput = sc.nextLine().toLowerCase();
		Set<Character>uniq=new HashSet<>();
		for(char c:userinput.toCharArray()) 
		if(Character.isLetter(c)) {
			uniq.add(c);
		}System.out.println(uniq);
	}

}
