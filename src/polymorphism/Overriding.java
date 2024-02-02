package polymorphism;

public class Overriding {

	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		PunjabBank pnb = new PunjabBank();
		BOIbank boi = new BOIbank();
		CanaraBank cnd = new CanaraBank();
		System.out.println("SBI Rate of Interest:" + sbi.getRateOfInterest());
		System.out.println("PNB Rate of Interest:" + pnb.getRateOfInterest());
		System.out.println("BOI Rate of Interest:" + boi.getRateOfInterest());
		System.out.println("Canara Rate of Interest:" + cnd.getRateOfInterest());

	}

}
