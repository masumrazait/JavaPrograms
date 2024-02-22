package javaProgramForTesterFeb;

public class NonRepeatedLetter {

	public static void main(String[] args) {
		String input = "masum";
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) == input.lastIndexOf(c)) {
				System.out.println(c);
			}
		}
	}
}