package polymorphism;

public class Overloading {

	// Method Overloading: changing no. of arguments
	static int add(int a, int b) {
		return (a + b);
	}

	static int sub(int a, int b, int c) {
		return (a - b - c);
	}

	// Method Overloading: changing data type of arguments
	static double sub(double a, double b) {
		return (a - b);
	}

	public static void main(String[] args) {
		System.out.println("Addition of two number is: " + Overloading.add(11, 22));
		System.out.println("Substraction of two number is: " + Overloading.sub(51, 22, 18));
		System.out.println("Substraction of two number is " + Overloading.sub(22.5, 11.5));
	}
}
