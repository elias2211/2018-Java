
public class TestCircleWithStaticMembers {
	public static void main(String args[]){
		System.out.println("Before creating objects");
		System.out.println("The number of circle objects is " +
			CircleWithStaticMembers.numberOfObjects);
		
		//Create cl
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		
		//Display c1 before c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")"); 
		
		//Create c2
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		
		//Modify c1
		c1.radius = 9;
		
		//Display c1 and c2 after c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")"); 
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")"); 
		
		
		int elias[] = {2, 5, 6, 7, 9, 10};
		
		System.out.println(elias[4]);
		
		int hana[] = new int[5];
			hana[0] = 12;
			hana[1] = 34;
			
			System.out.println(hana[0]);
		
		
		
	}
}
