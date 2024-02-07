package coding;

public class VowelLatter {

	public static void main(String[] args) {
		String input = "MasumRazaRani";
		String vowel = "AEIOUaeiou";
		for (char c : input.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.println("vowel latter is : " + c);
			}
		}
	}
}
