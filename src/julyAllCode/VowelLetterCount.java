package julyAllCode;

public class VowelLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "masumrqoi";
		String vowel = "AEIOUaeiou";
		int count = 0;
		for (char c : input.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				count++;
				System.out.println("vowel letter is : " + c);
			}
		}
		System.out.println("total vowel letter persent in string : " + count);
	}

}
