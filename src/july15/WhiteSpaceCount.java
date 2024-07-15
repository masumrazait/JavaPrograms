package july15;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "masum raza i love you";
		int count = 0;
		for (int i = 0; i <= input.length() - 1; i++) {
			if (input.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
