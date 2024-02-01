package constructors;

class Constructors1 {
	String name;
	int roll;
	double fee;

	Constructors1(String name, int roll, double d) {
		this.name = name;
		this.roll = roll;
		this.fee = d;
	}

	void display() {
		System.out.println(name + " " + roll + " " + fee);
	}

	public static void main(String[] args) {
		Constructors1 s1 = new Constructors1("Masum", 1526, 50.05);
		Constructors1 s2 = new Constructors1("Raza", 1525, 25.05);
		Constructors1 s3 = new Constructors1("Sonu", 1524, 200.05);
		Constructors1 s4 = new Constructors1("Sahili", 1527, 305.05);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}
