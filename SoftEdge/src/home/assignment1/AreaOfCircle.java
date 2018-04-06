package home.assignment1;

public class AreaOfCircle {
	public void calculateAreaOfCircle(){
		float pi = 3.142f;
		int radius = 5;
		float area = pi*radius*radius;
		System.out.println(area);
	}
	public static void main(String[] args) {
		AreaOfCircle obj = new AreaOfCircle();
		obj.calculateAreaOfCircle();
		
	}
}
