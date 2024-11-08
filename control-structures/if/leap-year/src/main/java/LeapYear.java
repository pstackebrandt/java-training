/* Leap year: leap-year.java
 Code by Peter Stackebrandt

 Create a simple leap year test(Schaltjahr).
 Task by Kofler:Java.-2022, 5.8 W1 p. 106
 https://de.wikipedia/wiki/Schaltjahr

 Tasks:
   Get year from user
	Check year (must contain 4 numbers, must be positive)
	
	Check for leap year
	Print year and tell whether leap year
 
	todo Add tests
 
*/

public class LeapYear{
	
	public void run(){
		int year = 1600;
		boolean isLeapYear = this.isLeapYear(year);
		printResult(year, isLeapYear);
	}
	
	public boolean isLeapYear(int year){
		
		boolean isLeapYear;
		
		if(year % 400 == 0){
			//- Years divisible by 400 without a remainder are indeed leap years.
			isLeapYear = true;
		} else if (year % 100 == 0){
			//- Years divisible by 100 without a remainder are not leap years.
			isLeapYear = false;
		} else if (year % 4 == 0){
			//- Years divisible by 4 without a remainder are usually leap years.
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		
		return isLeapYear;
	}
	
	private void printResult(int year, boolean isLeapYear){
		System.out.println(year + " is a leap year? " + isLeapYear);
	}
	
	public static void main(String[] args){
		System.out.println("Calculation of leap year");
		
		LeapYear ly = new LeapYear();
		ly.run();
	}
}




    
