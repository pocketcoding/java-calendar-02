package abby.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxdaysOfMonth(int month) {

		return MAX_DAYS[month - 1];

	}

	public static void main(String[] args) {
		
		String PROMPT = "cal > ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1; // we need to initialize the month to compare in the while loop
		
		while (true) {
		
			System.out.print(PROMPT);
			month = scanner.nextInt();	
			
			if(month == -1) { break; }
			if(month > 12) { continue; }
			
			System.out.printf("The maximum dates of the month %d is %d \n", month, cal.getMaxdaysOfMonth(month));

		}

		System.out.println("Bye~");
		scanner.close();

	}

}
