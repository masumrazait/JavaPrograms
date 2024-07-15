package exceptionHandling;

public class TryFollowByCatchEitheFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[] = new int[5];
			arr[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException" + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
		} finally {
			System.out.println("inside finally block");
		}
	}
}
