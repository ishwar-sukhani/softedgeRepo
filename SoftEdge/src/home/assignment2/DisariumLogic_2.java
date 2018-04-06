package home.assignment2;

import java.util.Scanner;

public class DisariumLogic_2 {

	static int number;
	
	int countNumberofDigits(int num){
		int count = 0;
		while(num > 0){
			num = num / 10;
			count = count + 1;
			System.out.println(count);
		}
		return count;
	}
	
	void acceptNumber(){
		Scanner scr = new Scanner(System.in);
		System.out.print("Please enter any number to check for Disarium: ");
		number = scr.nextInt();
	}
	
	boolean checkDisariumNumber(int num){
			
		return false;
	}
	
	public static void main(String[] args) {
		DisariumLogic_2 obj = new DisariumLogic_2();
		obj.acceptNumber();
		obj.countNumberofDigits(number);
	}
}
