package july15;

public class NonRepeatingCharacter {
	public static void main(String arg[]) {

		// Non repeating character
		String input = "masum raza delhi bihar";
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) == (input.lastIndexOf(c))) {
				System.out.println("non repeating character is : " + c);
			}
		}
		// repeating character
		String sc = "mahimasum";
		for (char d : sc.toCharArray()) {
			if (sc.indexOf(d) != (sc.lastIndexOf(d))) {
				System.out.println("repeating character is: " + d);
			}
		}
	}
}
