/*Elias Feredegn
 * 9/13/2018
 * This program prompt a user to guess a number between 1 and 10. If the user guesses the number correctly, it will print out a message stating they got it right
 * if the number they entered is lower, it will print out a message letting them know it's too low finally if the number is too high, it will let them know.
 * 
 */
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		int userNumber = -1;
		int magicNumber;
		int answer = 1;
		
		Scanner input = new Scanner(System.in);
			
			while(answer != 0){
				magicNumber = (int)(Math.random() * 11);
				System.out.println("Please guess a number and hit the enter key on keyboard");
				userNumber = input.nextInt();
				
				if (userNumber == magicNumber){
					System.out.println("Congratulations! You guessed the correct number");
				}
				
				else if (userNumber > magicNumber){
					System.out.println("The number you guessed is too high");
				}
				
				else {
					System.out.println("The number you guessed is too low.");
				}
				System.out.println("Would you like to continue?");
			}
			magicNumber = (int)(Math.random() * 11);

			System.out.println("Game over!");
			
			 input.close();

		}

}
