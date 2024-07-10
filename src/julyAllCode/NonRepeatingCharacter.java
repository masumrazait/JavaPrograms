package julyAllCode;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "masum";
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) == (input.lastIndexOf(c))) {
				System.out.println("non repeating character is : " + c);
			}
		}
	}
}
