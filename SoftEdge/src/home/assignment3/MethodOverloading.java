package home.assignment3;

import java.util.Scanner;

public class MethodOverloading {
	
	double convertIntegerToFloat(int num){
		return num;
	}
	
	void addition(int num1, int num2){
		System.out.println((num1 + num2));
	}
	
	void multiplication(int num1, int num2){
		System.out.println((num1 * num2));
	}
	
	void substraction(int num1, int num2){
		System.out.println((num2 - num1));
	}
	
	void division(int num1, int num2){
		System.out.println((num2 / num1));
	}
	
	void addition(double num1, double num2){
		System.out.println((num1 + num2));
		System.out.println("Float Method Called");
	}
	
	void multiplication(double num1, double num2){
		System.out.println((num1 * num2));
		System.out.println("Float Method Called");
	}
	
	void substraction(double num1, double num2){
		System.out.println((num2 - num1));
		System.out.println("Float Method Called");
	}
	
	void division(double num1, double num2){
		System.out.println((num2 / num1));
		System.out.println("Float Method Called");
	}
	
	public static void main(String[] args) {
		int number1, number2, number3, number4;
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter 4 Numbers");
		number1 = scr.nextInt();
		number2 = scr.nextInt();
		number3 = scr.nextInt();
		number4 = scr.nextInt();

		MethodOverloading obj = new MethodOverloading();
		
		obj.addition(number1, number2);
		obj.multiplication(number1, number2);
		obj.substraction(number1, number2);
		obj.division(number1, number2);
		
		System.out.println("---------------------------------");
		//obj.convertIntegerToFloat(number3);
		//obj.convertIntegerToFloat(number4);
		
		obj.addition(obj.convertIntegerToFloat(number3), obj.convertIntegerToFloat(number4));
		obj.multiplication(obj.convertIntegerToFloat(number3), obj.convertIntegerToFloat(number4));
		obj.substraction(obj.convertIntegerToFloat(number3), obj.convertIntegerToFloat(number4));
		obj.division(obj.convertIntegerToFloat(number3), obj.convertIntegerToFloat(number4));
	}
	
}
