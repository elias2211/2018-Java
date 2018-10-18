import java.util.Scanner;
public class ConvertSecondsToHoursAndMinutes {
	public static void main (String[] args){
		
		//Declare variables
		int numberOfSeconds = 0;
		int numberOfMinutes = 0;
		int numberOfHours = 0;
		
		Scanner input = new Scanner(System.in);
		
		//Get number of inputs from the user
		System.out.println("Please enter the amount of seconds you would like to be converted to hours and minutes");
		numberOfSeconds = input.nextInt();
		
		//Convert number of seconds to minutes
		numberOfHours = numberOfSeconds / 3600;
		int remainingNumberOfSeconds = numberOfSeconds % 3600;
		numberOfMinutes = remainingNumberOfSeconds / 60;
		numberOfSeconds = numberOfSeconds % 60;
		
		//Print outcome in hours, minutes and seconds format
		System.out.println("The time is now " + numberOfHours + ":" + numberOfMinutes + ":" + remainingNumberOfSeconds);
		
		System.out.println(0B1111);
		
		//Get the current time
		long milliSeconds = System.currentTimeMillis();
		
		//convert milliseconds to seconds
		long totalSeconds = milliSeconds / 1000;
		System.out.println("Total Seconds is: " + totalSeconds);
		long seconds = totalSeconds % 60;
		System.out.println("Number of Seconds is: " + seconds);
		long totalMinutes = totalSeconds / 60;
		long minutes = totalMinutes % 60;
		System.out.println("Number of minutes is: " + minutes);
		long totalHours = totalMinutes / 60;
		long hours = totalHours % 24;
		System.out.println("Number of hours is: " + hours);
		System.out.println("Number of seconds converted to Hours minutes and seconds is " + hours + ":" + minutes + ":" + seconds);
		
		 input.close();

		
	}

}
