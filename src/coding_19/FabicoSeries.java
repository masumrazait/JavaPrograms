package coding_19;

public class FabicoSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1, sum = 0;
		System.out.println("n1" + "   " + "n2");
		for (int i = 2; i <= 18; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(sum);
		}
	}
}