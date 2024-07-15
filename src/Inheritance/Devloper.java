package Inheritance;

public class Devloper extends Emp {
	int age = 25;
	long mob = 9883732751l;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Devloper d = new Devloper();
		System.out.println("Dev name is :" + d.Name);
		System.out.println("Dev company name is :" + d.CmpName);
		System.out.println("Dev mob num is :" + d.mob);
		System.out.println("Dev salary is :" + d.salary);
	}

}
