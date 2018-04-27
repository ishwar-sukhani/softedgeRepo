package home.assignment4;

import java.util.Scanner;

public class DuplicateInStringArray {

	String arr[];
	
	public static void main(String[] args) {
		DuplicateInStringArray obj = new DuplicateInStringArray();
		obj.acceptStringArray();
		obj.findDuplicatesInStringArray();
	}

	void acceptStringArray(){
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Size of String");
		arr = new String[scr.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter "+(i+1)+" element of array: ");
			arr[i] = scr.next();
		}
		scr.close();
	}
	
	void findDuplicatesInStringArray(){
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].equalsIgnoreCase(arr[j])){
					count = count + 1;
					System.out.println("Duplicate Elements in String Array are");
					System.out.println(arr[i]+" is equal to "+arr[j]);
				}
			}
		}
		//System.out.println(count);
	}
}
