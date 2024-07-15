package julyAllCode;

public class BlankSpeceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Masum Raza Delhi H";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("The whiteSpace is : " + count);
	}
}
