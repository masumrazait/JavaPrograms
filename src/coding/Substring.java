package coding;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the userinput: ");
		String userinput = sc.nextLine();
		System.out.println("Enter the later:");
		String subsString = sc.nextLine().toLowerCase();
		int index = userinput.indexOf(subsString);
		System.out.println(subsString+" is "+index+" position");
	}

}
