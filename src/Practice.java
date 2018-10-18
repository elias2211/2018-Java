import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hey there");
		System.out.println("\f  jhjhjhjk");
		System.out.println("What's up");
		System.out.println("1\b2");
		
		
		String name = "elias haile feredegn";
		char ch = 'e';
		
		System.out.println(Character.toUpperCase(ch));
		System.out.println(name.toUpperCase());
		System.out.println(Character.isUpperCase(ch));
		System.out.println(Character.isLowerCase(ch));
		
		String zipcode = "-55421";
		
		char hey = zipcode.charAt(0);
			System.out.println(hey);
			
			if(zipcode.charAt(0) == '-'){
				System.out.println("It's a negative number");
			}
			else{
				System.out.println("it's a postivie number");
			}
			
			System.out.println(zipcode.charAt(zipcode.length() - 1));
			
			System.out.println("Enter a double number");
			double doubleNumber = input.nextDouble();
			System.out.println("The number you entered is " + doubleNumber);
			System.out.println("Please enter a word");
			input.nextLine();
			String stringInput = input.nextLine();
			System.out.println("The word you entered is " + "\"" + stringInput + "\"");
			
			System.out.println("Enter a word");
			String word = input.next();
			System.out.println("The word you entered is " + word);
			
			String s1 = "elias";
			String s2 = "Elias";
			
			System.out.println(s1.equalsIgnoreCase(s2));
			System.out.println("-4343".startsWith("-"));
			//String methods
			String str1 = "Welcome to Java"; 
			String str2 = "Programming is fun"; 
			String str3 = "Welcome to Java";
			System.out.println("");
			System.out.println("str1 == str2" + str1 == str2 + "Hey brown cow");
			System.out.println("str2 == str3 " + str2 == str3);
			System.out.println("str1.equals(str2) " + str1.equals(str2));
			System.out.println("str1.equals(str3) " + str1.equals(str3));
			System.out.println("str1.compareTo(str2) " + str1.compareTo(str2));
			System.out.println("str2.compareTo(str1) " + str2.compareTo(str1));
			System.out.println("str2.compareTo(str2 " + str2.compareTo(str2));
			System.out.println("str1.charAt(0) " + str1.charAt(0));
			System.out.println("str1.indexOf('j') " + str1.indexOf('j'));
			System.out.println("str1.indexOf(\"to\") " + str1.indexOf("to"));
			System.out.println("str1.lastIndexOf('a') " + str1.lastIndexOf('a'));
			System.out.println("str1.lastIndexOf(\"o\", 15) " + str1.lastIndexOf("o", 15));
			System.out.println("str1.length() " + str1.length());
			System.out.println("str1.substring(5) " + str1.substring(5));
			System.out.println("str1.startsWith(\"Wel\") " + str1.startsWith("Wel"));
			System.out.println("str1.endsWith(\"Java\") " + str1.endsWith("Java"));
			System.out.println("str1.toUpperCase() " + str1.toUpperCase());
			System.out.println("str.toLowerCase() " + str1.toLowerCase());
			System.out.println("s1.concat(s2) " + str1.concat(str2));
			System.out.println("str1 + str2 " + str1 + str2);
			System.out.println("s1.contains(s2) " + str1.contains(str2));
			System.out.println("\t Wel \t".trim());
			
			//Formatting
			int intNumber = 6789;
			
			System.out.println(123456789);
			System.out.printf("%9d", intNumber);
			System.out.println("");
			
			int switchNumber = 1222;
			
			switch(switchNumber){
				case 1:
					System.out.println("This is not the number");
					break;
				case 2: 
					System.out.println("This ain't the number either");
					break;
				case 1222:
					System.out.println("This is the number!");
					System.out.println("You got it!");
					break;
			}
			
			 input.close();

	}

}
