
public class SimpleCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCircle circle1 = new SimpleCircle();
		SimpleCircle circle2 = new SimpleCircle(25);
		SimpleCircle circle3 = new SimpleCircle(50);
		
			System.out.printf("Area of a circle with radius 1 is: %.2f",  circle1.getArea());
			System.out.printf("\nArea of a circle with radius 25 is: %.2f", circle2.getArea());
			System.out.printf("\nArea of a circle with radius 50 is: %.2f", circle3.getArea());
			
			circle2.setRadius(10);
			
			System.out.printf("\nArea of a circle with radius 10 is: %.2f", circle2.getArea());
	}
	
	double radius;
	
	//Construct a circle with radius 1
	SimpleCircle(){
		radius = 1;
	}
	
	//Construct a circle with desired radius
	SimpleCircle(double newRadius){
		radius = newRadius;
	}
	
	//Get the area of the circle
	double getArea(){
		return radius * radius * Math.PI;
	}
	
	//Get the perimeter of the circle
	double getPerimeter(){
		return 2 * radius * Math.PI;
	}
	
	//Set a new radius for a circle
	void setRadius(double newRadius){
		radius = newRadius;
	}
}
