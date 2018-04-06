package home.assignment2;

import java.util.Scanner;

public class DisariumLogic_1 {

	static int number;
	
	// This method will accept a number from user using scanner 
	void acceptNumber(){
		Scanner scr = new Scanner(System.in);
		System.out.print("Please enter any number to check for Disarium: ");
		number = scr.nextInt();
	}
	
	// This method will accept number as parameter and return true or false based on whether the number is disarium or not
	boolean checkDisariumNumber(int num){
		int countDigits = Integer.toString(num).length(); 
		int rem = 0, sum = 0;
		while(num > 0){
			rem = num % 10;
			sum = (int) (sum + (Math.pow(rem, countDigits--)));
			num = num / 10;
		}
		
		return (sum == number);
	}
	
	public static void main(String[] args) {
		DisariumLogic_1 obj = new DisariumLogic_1();
		obj.acceptNumber();
		System.out.println(obj.checkDisariumNumber(number) ? number+" is a Disarium Number" : number+ " is Not a Disarium Number");
	}
}
