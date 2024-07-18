package capgimini;

public class SecondLastGreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 10, 12, 34, 4445, 522, 11, 2, 344, 555, 3333 };
		int f = ar[0];
		int s = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > f) {
				s = f;
				f = ar[i];
			} else if (ar[i] > s) {
				s = ar[i];
			}
		}
		System.out.println(s);
	}
}
