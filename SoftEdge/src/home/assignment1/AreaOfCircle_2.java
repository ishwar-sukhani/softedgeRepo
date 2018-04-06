package home.assignment1;

public class AreaOfCircle_2 {
	
	static final float pi = 3.142f;
	public static float calculateAreaOfCircle(int radius){
		float area = pi*radius*radius;
		return area;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Area of Circle is "+ AreaOfCircle_2.calculateAreaOfCircle(8));
	}
}
