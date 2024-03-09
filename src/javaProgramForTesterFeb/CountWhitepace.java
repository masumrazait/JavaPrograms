package javaProgramForTesterFeb;

public class CountWhitepace {

	public static void main(String[] args) {
		String input = "Masum       raza";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
