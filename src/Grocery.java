import java.util.Scanner;
/* Elias Feredegn
 * This program imitates self check out at a grocery store. It requires the user to enter name, price, quantity and tax rate of a product then it calculates and displays the total
 * price of the product and finally displays grand total of all products including tax. 
 */

public class Grocery {
		public static void main(String[] args){
			
			// Declare constant number.
		//	final double TAX = 3.14159;
			
			//Declare all variables
			String product1;
			String product2;
			String product3;
			double product1Price = 0.0;
			double product2Price = 0.0;
			double product3Price = 0.0;
			int product1Quantity = 0;
			int product2Quantity = 0;
			int product3Quantity = 0;
			double totalPrice = 0.0;
			double grandTotal = 0.0;
			double taxRate = 0.0;
			double totalTax = 0.0;
			
			Scanner input = new Scanner(System.in);
			
			//Prompt user to enter product information. 
			System.out.println("Please enter the name, price and quantity of the first product.");
		    product1 = input.nextLine();
			product1Price = input.nextDouble();
			product1Quantity = input.nextInt();
			input.nextLine();
			System.out.println("You entered: " + product1 + " " + product1Price + " " + product1Quantity);
			
			System.out.println("Please enter the name, price and quantity of the second product");
			product2 = input.nextLine();
			product2Price = input.nextDouble();
			product2Quantity = input.nextInt();
			input.nextLine();
			System.out.println("You entered: " + product2 + " " + product2Price + " " + product2Quantity);
			
			System.out.println("Please enter the name, price and quantity of the third product.");
			product3 = input.nextLine();
			product3Price = input.nextDouble();
			product3Quantity = input.nextInt();
			System.out.println("You entered: " + product3 + " " + product3Price + " " + product3Quantity);
			
			System.out.println("Please enter the tax rate between 0 and 1");
			taxRate = input.nextDouble();
			
			//Outputs
			totalPrice = product1Price + product2Price + product3Price;
			totalTax = totalPrice * taxRate;
			grandTotal = totalPrice + totalTax;
		
			System.out.print("Total price for " + product1 + ", " + product2 + " and " + product3 + " Is: ");
			System.out.printf("$%6.2f", totalPrice);
			System.out.println("");
			System.out.printf("Total price including tax is: $%6.2f", grandTotal);
			
			input.close();
		}
}
