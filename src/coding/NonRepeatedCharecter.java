package coding;

public class NonRepeatedCharecter {

	public static void main(String[] args) {
		String input = "adadsasffrfdbhSFGddshHVMmdfnH";
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) == input.lastIndexOf(c)) {
				System.out.println("distinct charecter is: " + c);
			}
		}
	}
}
