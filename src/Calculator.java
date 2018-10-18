
public class Calculator {
		public static int multiply(int number1, int number2)
		{
			return number1 * number2;
		}
		
		public static int subtract(int number1, int number2)
		{	
			return number1 - number2;
		}
		
		public static int add(int number1, int number2)
		{	
			return number1 + number2;
		}
		
		public static double devide(double number1, double number2)
		{	
			return number1 / number2;
		}
		
		public static void main(String[] args){
			System.out.println("2 * 6 is: " + multiply(2, 6));
			System.out.println("9 * 8 is: " + multiply(9, 8));
			
			System.out.println("\n10 - 5 is: " + subtract(10, 5));
			System.out.println("5 - 10 is: " + subtract(5, 10));
			
			System.out.println("\n10 / 5 is: " + devide(10, 5));
			System.out.println("5 / 10 is: " + devide(5, 10));
			
			System.out.println("\n10 + 5 is: " + add(10, 5));
			System.out.println("5 + 10 is: " + add(5, 10));
		}

}
