import java.util.Scanner;
public class Zipcode {
	public static void main(String[] args) {
		String zipcode;
		int intZipcode;
		String answer = "yes";
		
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("Please Enter a zipcode");
			zipcode = input.next();
			intZipcode = Integer.parseInt(zipcode);
		
			while(!(zipcode.length() == 5)){
				System.out.println("\nZipcode must be 5 digits long. Please enter a valid zipcode.");
				zipcode = input.next();
				intZipcode = Integer.parseInt(zipcode);
			}
			if(intZipcode > 0){
					if(zipcode.equals("55421")){
						System.out.println("City:           Minnapolis");
						System.out.println("County:         Hennepin");
						System.out.println("Fun fact:       I lived there for 14 years!");
					}
					else if(zipcode.equals("55413")){
						System.out.println("City:           St Anthony");
						System.out.println("County:         Hennepin");
						System.out.println("Fun fact:       I lived there for a year");
					}
					else {
						System.out.println("The zipcode you entered is not in our database");
					}
					//break;
					}
				else{
				System.out.println("Zipcode must be greater than 0");
				}
				System.out.println("\nWould you like to continue? Enter yes to continue no to quit.");
				answer = input.next(); } 
			while( (answer.equals("yes") ));
		
			System.out.println("Exiting!");
			
			 input.close();

			
	}
}
