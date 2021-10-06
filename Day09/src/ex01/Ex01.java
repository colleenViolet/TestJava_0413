package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] numbers = new int [3][4];
		
		for(int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
			//같은 값 넣기 	
				numbers[i][j] = 10;
				
				//열 별로 다른 값 넣기 
				//numbers[i][j] = j;
				
				//특정 인덱스만 값 넣기 
				//if(i == 1) {
				// numbers[i][j] = 1;
				//}
				
//				if(j == 2) {
//					numbers[i][j] = 1;
//				}
			}
		}
		
		
		for(int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
