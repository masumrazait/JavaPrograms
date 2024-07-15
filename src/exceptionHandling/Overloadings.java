package exceptionHandling;

public class Overloadings {

	static int sum(int a, int b) {
		return (a + b);
	}

	static int sum(int a, int b, int c) {
		return (a + b + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Overloadings.sum(1, 23));
		System.out.println(Overloadings.sum(1, 23, 33));

	}

}
