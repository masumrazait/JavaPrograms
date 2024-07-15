package july15;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "masum";
		String rev = "";
		int len = input.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println("reverse string is : " + rev);
	}

}
