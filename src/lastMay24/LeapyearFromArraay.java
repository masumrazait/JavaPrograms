package lastMay24;

public class LeapyearFromArraay {

	public static void main(String[] args) {
		int ar[] = { 2022, 2020, 2018, 2012, 2016 };
		for (int year : ar) {
			if ((year % 4 == 0) && (year != 100) || (year % 400 == 0)) {
				System.out.println("leap year" + year);
			} else {
				System.out.println("not leap year :" + year);
			}
		}
	}

}
