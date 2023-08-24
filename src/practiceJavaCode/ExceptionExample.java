package practiceJavaCode;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 2, 3 ,4,5,6,8,8,9,5};

		int result = numbers[5]; // This will throw an ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array index out of bounds: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("Arithmetic exception: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("General exception: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}
	}
}
