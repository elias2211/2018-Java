
public class Addition {


		
		public static int add(int i1, int i2){
			int sum = 0;
			for(int i = i1; i <= i2; i++)
			    sum += i;
				
				return sum;
		}
			
			
		

		public static void main(String[]args){
			System.out.println("The sume of 1 to 10 is: " + add(1, 10));
			System.out.println("The sume of 1 to 4 is: " + add(1, 4));

		}
		
		
		
		
		
		
	

}
