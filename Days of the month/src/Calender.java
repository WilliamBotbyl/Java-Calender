
//name
//comp-171-002
//homework #3
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a month, 1-12");
		int month = input.nextInt();

		System.out.println("Enter a year, YYYY");
		int year = input.nextInt();

		input.close();

		switch (month) {
		case 1:
			System.out.println("January " + year + " has 31 days in it.");
			break;
		case 2:
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("February " + year + " has 29 days in it because it is a leap year.");
				break;
			} else {
				System.out.println("February " + year + " has 28 days in it.");
				break;
			}
		case 3:
			System.out.println("March " + year + " has 31 days in it.");
			break;
		case 4:
			System.out.println("April " + year + " has 30 days in it.");
			break;
		case 5:
			System.out.println("May " + year + " has 31 days in it.");
			break;
		case 6:
			System.out.println("June " + year + " has 30 days in it.");
			break;
		case 7:
			System.out.println("July " + year + " has 31 days in it.");
			break;
		case 8:
			System.out.println("August " + year + " has 31 days in it.");
			break;
		case 9:
			System.out.println("September " + year + " has 30 days in it.");
			break;
		case 10:
			System.out.println("October " + year + " has 31 days in it.");
			break;
		case 11:
			System.out.println("November " + year + " has 30 days in it.");
			break;
		case 12:
			System.out.println("December " + year + " has 31 days in it.");
			break;
		}

	}

}
