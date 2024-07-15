package july15;

public class WordCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "masum raza i love you";
		int count = 1;
		for (int i = 1; i <= input.length() - 1; i++) {
			if ((input.charAt(i) == ' ') && (input.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
