package polymorphism;

class ChangingNoArgument {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(ChangingNoArgument.add(11, 11));
		System.out.println(ChangingNoArgument.add(11, 11, 11));
	}
}