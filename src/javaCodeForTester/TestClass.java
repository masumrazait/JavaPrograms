package javaCodeForTester;

public class TestClass {

	public static void main(String[] args) {
		try {
			int a = 30;
			int b = 40;
			int c = 10;
			int expression = (a * b) / (a - b + c);

			// Other code within the try block

		} catch (ArithmeticException e) {
			// This block will be executed if an ArithmeticException occurs
			System.out.println( e.getMessage());

			// You can also log the exception or take other appropriate actions

		} catch (Exception e) {
			// This block will be executed for other types of exceptions
			System.out.println("Exception caught: " + e.getMessage());

			// You can also log the exception or take other appropriate actions

		} finally {
			// This block will be executed regardless of whether an exception occurred or
			// not
			System.out.println("This block always executes");
		}
	}
}
