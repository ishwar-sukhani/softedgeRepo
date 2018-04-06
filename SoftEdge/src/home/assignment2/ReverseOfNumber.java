package home.assignment2;

import java.util.Scanner;

public class ReverseOfNumber {

	// Class Variable
	int number, reverse;
	
	// Method to accept number from user
	void acceptNumber(){
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		number = scr.nextInt();
	}
	
	// Method to count number of digits in entered number
	int countNumberOfDigits(){
		int count=0, copy=0;
		copy = number;
		while(copy > 0){
			copy = copy / 10;
			count = count + 1;		
		}
		return count;
	}
	
	// Method to reverse number and print it immediately
	void reverseNumberAndPrint(){
		int copyNumber = number;
		for (int i = 0; i < countNumberOfDigits(); i++) {
			reverse = copyNumber % 10;
			copyNumber = copyNumber / 10;
			System.out.print(reverse);
		}
		System.out.println();
	}
	
	// Method to reverse number by counting number of digits in entered number 	
	void reverseNumberUsingLogic(){
		int reminder = 0;
		int copyNumber = number;
		reverse = 0;
		for (int i = 100; i > 0 ; i=i/10) {
			reminder = copyNumber % 10;
			reverse = reverse + (reminder * i);
			copyNumber = copyNumber / 10;
		}
		System.out.println(reverse);
	}
	
	// Method to reverse number by referring Internet
		int reverseNumberUsingInternet(){
			reverse = 0;
			int copyNumber = number;
			while(copyNumber != 0){
				reverse = reverse * 10;
				reverse = reverse + (copyNumber % 10);
				copyNumber = copyNumber / 10;
			}
			return reverse;
		}
	
	// Initialization Method
	public static void main(String[] args) {
		ReverseOfNumber obj = new ReverseOfNumber();
		obj.acceptNumber();
		obj.reverseNumberAndPrint();
		obj.reverseNumberUsingLogic();
		System.out.println(obj.reverseNumberUsingInternet());
		
	}

}
