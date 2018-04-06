package home.assignment2;

import java.util.Scanner;

public class NumberTable {

	int num1, num2;
	
	void acceptNumbersFromUser(){
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		num1 = scr.nextInt();
		System.out.print("Enter Number 2: ");
		num2 = scr.nextInt();
	}
	
	void printTableBetweenTwoNumbers(){
		for(int i = num1; i <= num2; i++){
			for (int j = 1; j <= 10; j++) {
				if(i % 2 == 0){
					if((i*j) % 2 == 0){
						System.out.println(i+" * " +j+ " = " +(i*j));
					}
				}
				else{
					if((i*j) % 2 != 0){
						System.out.println(i+" * " +j+ " = " +(i*j));
					}
				}

			}
			System.out.println("--------------------------------------------------------");
		}
	}
	
	// Initialization Method
	public static void main(String[] args) {
		NumberTable obj = new NumberTable();
		obj.acceptNumbersFromUser();
		obj.printTableBetweenTwoNumbers();
	}

}
