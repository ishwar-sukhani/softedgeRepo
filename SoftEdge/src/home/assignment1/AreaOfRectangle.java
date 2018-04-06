package home.assignment1;

public class AreaOfRectangle {
	
	public int areaOfRectangle(int length, int width){
		int area = length*width;
		return area;
	}
	
	public static void main(String[] args) {
		AreaOfRectangle obj = new AreaOfRectangle();
		System.out.println("Area of Rectangle = "+obj.areaOfRectangle(14, 14));
	}
}
