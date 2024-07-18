package capgimini;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello world";
		String vowel = "AEIOUaeiou";
		int count = 0;
		for (char c : input.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);
	}

}
