
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		while(num * 4 < 30) {
			num++;
			
			while(num % 2 == 0) {
				num++;
			}
			System.out.println("After inner loop: " + num);
		}
		System.out.println("After outer loop: " + num);
		java.util.Date date = new java.util.Date();
		
		System.out.println(date.toString());
		System.out.println(date.getTime());
		System.out.println(date.getTime() / 1000 / 60 % 60 % 24);
		
		
		
		
		
		
		int medu = 14;
		
		
		while(medu > 0)
		{
			medu = medu/3;
			
			System.out .println(medu);

			
		}
		
		
		System.out .println(medu);
		
		//System.out.println(elias);
		
		
		
		
		
		
	}

}
