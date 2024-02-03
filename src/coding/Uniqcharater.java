package coding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Uniqcharater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the userinput:");
		String userinput = sc.nextLine().toLowerCase();
		Set<Character> UniqLatter = new HashSet<>();
		for (char c : userinput.toCharArray())
			if (Character.isLetter(c))
				UniqLatter.add(c);
		{
			System.out.println("uniq letter is :" + UniqLatter);
		}
	}

}
