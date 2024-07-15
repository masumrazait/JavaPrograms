package julyAllCode;

public class BlankSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sc = "Masum raza delhi I love in dia";
		int count = 0;
		for (int i = 0; i <= sc.length() - 1; i++) {
			if (sc.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
