        package javaCodeForTester;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String UserInput=scc.nextLine();
		Set<Character>uniqCharacters=new HashSet<>();
		for(char c : UserInput.toCharArray())
			if(Character.isLetter(c))
				uniqCharacters.add(c);
		System.out.println("Removed the Dublicate Charecters:" +uniqCharacters);

	}

}
