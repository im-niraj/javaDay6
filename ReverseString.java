package com.day6;
import java.util.Scanner;
public class ReverseString {

	public static String reversString(String input){
		String newStr = "";
		for(int i=input.length()-1; i>=0; i--) {
			newStr+=input.charAt(i);
		}
//		System.out.println(newStr);
		return newStr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);

	}

}
