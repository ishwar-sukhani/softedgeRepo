package home.assignment1;

public class Tables {

	public static void main(String[] args) {
		int a = 21, b = 29;
		for (int i = a; i <= b; i++) {
			System.out.println("---------------- Table of "+i+" ----------------------");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			//System.out.println("---------------- Table of "+i+" ----------------------");
		}

	}

}
