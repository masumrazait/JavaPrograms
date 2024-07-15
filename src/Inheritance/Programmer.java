package Inheritance;

public class Programmer extends Employee {

	int bonus = 25;
	String role = "Dev";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		System.out.println("Programmer Salary:" + p.salary);
		System.out.println("Programmer Role:" + p.role);
		System.out.println("Programmer Bonus:" + p.bonus);
		System.out.println("Programmer Age:" + p.age);
	}
}
