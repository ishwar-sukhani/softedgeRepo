package home.assignment4;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String to be Reversed");
		String str = scr.nextLine();
		
		String output = mirrorReverse(str);
		System.out.println("Mirror Reverse: "+output);
		
		String output2 = charReverse(str);
		System.out.println("Character Reverse: "+output2);
		
		String output3 = positionReverse(str);
		System.out.println("Position Reverse: "+output3);
	}
	
	public static String mirrorReverse(String str){ // "Ishwar Sukhani"  ---> "inahkuS rawhsI"
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--){ 
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
	
	public static String charReverse(String str){ // "Ishwar Sukhani"  ---> "rawhsI inahkuS"
		String reverse = "";
		String arr[] = str.split("\\s");
		for (String s : arr) {
			for(int i = s.length() - 1; i >= 0; i--){
				reverse = reverse + s.charAt(i);
			}
			reverse = reverse.concat(" ");
		}
		return reverse;
	}
	
	public static String positionReverse(String str){ // "Ishwar Sukhani"  ---> "Sukhani Ishwar"
		String reverse = "";
		String arr[] = str.split("\\s");
		for (String s : arr) {
			reverse = s + " " + reverse; 
		}
		return reverse;
	}

}
