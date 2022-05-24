package com.day6;

public class EvenSumColumn {
	
	public static void main(String[] args) {
		int N=3;
		int M=3;
		int[][] matrix = new int[N][M];
		int x=1;
		
//		store value from 1 to 9 using loop
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				matrix[i][j] = x++;
			}
		}
		
		
//		printing sum of even number in each column
		for(int i=0; i<N; i++) {
			int sum=0;
			for(int j=0; j<M; j++) {
				if(matrix[j][i]%2 == 0) {
					sum+=matrix[j][i];
				}
			}
			System.out.println(sum);
		}
	}
}
