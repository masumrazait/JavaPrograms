package juneCodingAllProgram;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String sc = "masumraza";
		int count = 0;
		for (char c : sc.toCharArray()) {
			if (sc.indexOf(c) != (sc.lastIndexOf(c))) {
				count++;
				System.out.print(c);
			}
		}
		System.out.println("");
		System.out.println("total leter is : " + count);
	}
}
