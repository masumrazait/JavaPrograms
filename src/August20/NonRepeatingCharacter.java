package August20;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "masim";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == (str.lastIndexOf(c))) {
				count++;
				System.out.println(c);
			} 
		}
		System.out.println("non repating : " + count);
	}
}
