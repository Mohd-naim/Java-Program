package Java_100_Program;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class CalTime {
	public static void main(String[] args) throws InterruptedException {
	
		for(int i=1;i<=10;i++) {
			System.out.println(date());
			Thread.sleep(1000);
		}
	}

	private static String date() {
		LocalDateTime now = LocalDateTime.now();
		int hr = now.getHour();
		int minute = now.getMinute();
		int sec = now.getSecond();
		int date = now.getDayOfMonth();
		DayOfWeek day = now.getDayOfWeek();
		int year = now.getYear();	
//		System.out.println(hr+":"+minute+":"+sec+":"+date+":"+day+":"+year);
		String dat = hr+":"+minute+":"+sec+":"+date+":"+day+":"+year;
		return dat;
	}

}
