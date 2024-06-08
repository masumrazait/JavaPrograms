package juneCodingAllProgram;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String sc = "masumraza";
		for (char c : sc.toCharArray()) {
			if (sc.indexOf(c) == (sc.lastIndexOf(c))) {
				System.out.print(c);
			}
		}
	}
}
