package julyAllCode;

public class LeapYearOrCommonYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 2022, 2016, 2032, 2023, 3032, 3035, 3044, 3034, 4040, 4054, 4444, 4505 };
		for (int year : ar) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + " it is leap year");
			} else {
				System.out.println(year + " it is not leap year");
			}
		}
	}
}
