package softedge;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=11, b=12, temp=0;
		System.out.println("Numbers before Swap are:");
		System.out.println("Number 1 = "+a+ " Number 2 = "+b);
		// Using temp variable 
/*		temp = a;
		a = b;
		b = temp;
*/		
		// Without using temp variable
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("\nNumbers after Swap are:");
		System.out.println("Number 1 = "+a+ " Number 2 = "+b);
	}

}
