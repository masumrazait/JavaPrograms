package August1;

public class VowelLetterCount {

	public static void main(String[] args) {
		String str = "CaliFAlOwEr";
		String vowel = "AEIOUaeiou";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);
	}

}
