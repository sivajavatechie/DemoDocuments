package com.sivajavatechie.demo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
/**
 * 
 * @author Sivareddy
 * Create a class with ListStartAndEndDateOfMonthForGivenRange in your IDE under package com.sivajavatechie.demo.
 * Run as java application
 *
 */
public class ListStartAndEndDateOfMonthForGivenRange {

	public static void main(String[] args) {
	
		String inputStartDate = "2010-01-25";
		String inputEndDate = "2010-12-25";
		
		/**
		 * Convert java.util.Date to LocalDate 
		 * 		Date date = new Date();
		 *	LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		 * 
		 * Covert java.sql.Date to LocalDate
		 * 		java.sql.Date sqldate = new java.sql.Date(System.currentTimeMillis());
		 *		LocalDate  sqlLocalDate = sqldate.toLocalDate();
		 */
		
		LocalDate startDate = LocalDate.parse(inputStartDate);
		LocalDate endDate = LocalDate.parse(inputEndDate);
		
		if (startDate.isAfter(endDate)) {
			System.out.println("Start date should not be after End Date");
			return;
		}

		
		while(!startDate.isAfter(endDate)) {
			//String month = startDate.getMonth().name(); print month full name in Upper case
			
			String month = startDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.US);
			
			//LocalDate startMonthDate = startDate.withDayOfMonth(1);// to print start date of each month
			LocalDate startMonthDate = startDate;
			LocalDate endMonthDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
			
			if (endMonthDate.isAfter(endDate)) {
				endMonthDate = endDate;
			}
			System.out.println("Month is --> " + month + " -->" + "start date of month --> " + startMonthDate + "  end date of month --> " + endMonthDate);
			startDate = endMonthDate.plusDays(1);
		}
	}

}
