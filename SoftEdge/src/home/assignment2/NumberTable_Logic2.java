package home.assignment2;

public class NumberTable_Logic2 {

	public static void main(String[] args) {
		int num1 = 3, num2 = 9;
		
		for (int i = num1; i <= num2; i++) {
			for (int j = 1; j <= 10; j++) {
				if(i % 2 == 0 && ((i * j) % 2 == 0)){
					System.out.println(i+" * " +j+ " = " +(i*j));
				}
				else if((i * j) % 2 != 0){
					System.out.println(i+" * " +j+ " = " +(i*j));
				}
			}
			System.out.println("---------------------------------------------");
		}
	}

}
