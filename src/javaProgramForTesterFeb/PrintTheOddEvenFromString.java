package javaProgramForTesterFeb;

public class PrintTheOddEvenFromString {

	public static void main(String[] args) {
		String input = "masum";
		for (int i = 0; i < input.length(); i += +2) {
			System.out.print(" " + input.charAt(i));
		}
	}
}
