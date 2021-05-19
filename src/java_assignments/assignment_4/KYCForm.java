package java_assignments.assignment_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KYCForm{
	
	Date signUpDate,currDate;
	
	/*
	 * findRange() method is used to give the exact valid range for the filling up of the KYC form
	 * It takes in 2 input parameters - 
	 * signUp - Sign up date
	 * currDateInput - Current date
	 */
	
	public void findRange(String signUp, String currDateInput) {
		
		Date startDate = null;
		Date endDate = null;
		
		try {
				boolean flag = false;
				//Use SimpleDateFormat to convert string to date
				
				SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
				signUpDate = dateFormatter.parse(signUp);
				currDate = dateFormatter.parse(currDateInput);
				
				//Invalid input check
				Calendar calendarTemp = Calendar.getInstance();
				calendarTemp.setTime(signUpDate);
				calendarTemp.add(Calendar.DATE, 364);
				Date tempDate = calendarTemp.getTime();
				
				if(signUpDate.after(currDate)) {
					System.out.println("No range");
					flag = true;
				}
				else if(!currDate.after(tempDate)) {
					System.out.println("No range");
					flag = true;
				}
				else {
					startDate = signUpDate;
	
					startDate.setYear(currDate.getYear());
					
					//Creating a calendar object
					Calendar calendar = Calendar.getInstance();
					
					//setting startDate as calendar current date
	 				calendar.setTime(startDate);
	 				
	 				//Subtracting 30 days to get the startDate		
					calendar.add(Calendar.DATE, -30);
					
					startDate = calendar.getTime();
					
					//Adding 60 days to get the endDate	
					calendar.add(Calendar.DATE, 60);
					
					endDate = calendar.getTime();
					
					//Check if endDate is after the currDate
					if(endDate.after(currDate)) {
						endDate = currDate;
					}
				}
				
				//Converting date objects to strings
				
				if(!flag) {
					String startDateString = dateFormatter.format(startDate);
					String endDateString   = dateFormatter.format(endDate);
					
					System.out.println(startDateString + " " + endDateString);
				}
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
}