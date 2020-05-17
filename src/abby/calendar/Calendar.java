package abby.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxdaysOfMonth(int month) {
		
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		
		String PROMPT = "cal > ";
		Scanner scanner = new Scanner(System.in);
		System.out.print(PROMPT);
		int month = scanner.nextInt();
		
		System.out.println(month*month);
	
		
		
	}

}
