package August20;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "masumabduLazizAnsari".toLowerCase();
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) != (str.lastIndexOf(c))) {
				System.out.println("repating character is : " + c);
			} else {
				System.out.println("non repating character is : " + c);
			}
		}
	}
}
