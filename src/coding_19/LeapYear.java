package coding_19;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 2002, 2023, 2024, 2018, 2026, 2023, 2026, 2042 };
		for (int year : ar) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + "leap year");
			} else {
				System.out.println(year + "not leap year");
			}
		}

	}

}
