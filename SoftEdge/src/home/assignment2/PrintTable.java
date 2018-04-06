package home.assignment2;

import java.util.Scanner;

public class PrintTable {

	int number;
		
	void acceptNumber(){
		Scanner scr = new Scanner(System.in);
		System.out.print("Please enter number for which table: ");
		number = scr.nextInt();
	}
	
	void printTableTill8(){
		for(int i = 1; i <= 10; i++){
			if((number*i) <= 8){
				System.out.println(number + " * " + i + " = " + (number*i));
			}
			
		}
	}
	
	public static void main(String[] args) {
		PrintTable obj = new PrintTable();
		obj.acceptNumber();
		obj.printTableTill8();
	}

}
