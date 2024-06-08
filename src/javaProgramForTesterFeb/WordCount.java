package javaProgramForTesterFeb;

public class WordCount {

	public static void main(String[] args) {
		String a = "ind country";
		int count = 1;
		for (int i = 0; i < a.length() - 1; i++) {
			if ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
