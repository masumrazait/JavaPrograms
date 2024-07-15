package abstractclass;

class Honda extends Bike {
	protected void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
	}
}