package com.day6;
import java.util.*;
public class FindPrime {
	public boolean checkPrime(int num) {
		int count=0;
		for(var i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count >2) {
			return false;
		}
		return true;
	}

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		ArrayList<Integer> secondArray = new ArrayList<Integer>();
		for(int i=0; i<inputArray.length; i++) {
			boolean flag = new FindPrime().checkPrime(inputArray[i]);
			if(flag) {
				secondArray.add(inputArray[i]);
			}	
		}
		int[] n = new int[secondArray.size()];
		Arrays.setAll(n, secondArray::get);
		return n;
	}
	public static void main(String[] args) {
		int[] arr = {10,12,5,50,11,14,15};
		int[] ans = new FindPrime().findAndReturnPrimeNumbers(arr);
		if(ans.length>0) {
			for(int i=0; i<ans.length; i++) {
				System.out.println(ans[i]);
			}
		}
		else {
			System.out.println("Prime number not found in the supplied Array");
		}
		
		
	}

}
