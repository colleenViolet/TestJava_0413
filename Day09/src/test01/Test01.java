package test01;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		
		
//		[2][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 모든 곳에 10을 넣고 출력하세요.
		int[][] numbers = new int [2][3];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = 10;
				System.out.print (numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		[3][4] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.
		int[][] numbers1 = new int[3][4];
		for (int i = 0; i < numbers1.length; i++) {
			for (int j = 0; j < numbers1[i].length; j++) {
				numbers1[i][j] = j + 1;
				System.out.print(numbers1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 첫 배열은 1, 두번째 배열은 2, 세번째 배열은 3 으로 채우고 출력 하세요.
		int[][] numbers2 = new int [3][3];
		
		for (int i = 0; i < numbers2.length; i++) {
			for (int j = 0; j < numbers2[i].length; j++) {
				numbers2[i][j] = i + 1;
				System.out.print(numbers2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		

		//[5][5] 크기의 배열을 만드세요.
		//모든 값을 0으로 초기화 하세요.
		//반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.
		int[][] numbers3 = new int [5][5];
		
		for (int i = 0; i < numbers3.length; i++) {
			for (int j = 0; j < numbers3[i].length; j++) {
				if(i == 2 || j == 2) {
					numbers3[i][j] = 1;
				}else {
					numbers3[i][j] = 0;
				}
				System.out.print(numbers3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
		int[][] ziffere = new int [3][3];
		
		//(예시 1)
//		int number = 1;
//		for (int i = 0; i < ziffere.length; i++) {
//			for (int j = 0; j < ziffere[i].length; j++) {
//				ziffere[i][j] = number ;
//				System.out.print( ziffere[i][j] + " ");
//				number ++;
//			}
//			System.out.println();
//		}
		
		//(예시 2)
		for (int i = 0; i < ziffere.length; i++) {
			for (int j = 0; j < ziffere[i].length; j++) {
				ziffere[i][j] = (j + 1) + (i * 3) ;
				System.out.print( ziffere[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
		
		int[][] ziffere1 = new int [3][3];
		for (int i = 0; i < ziffere1.length; i++) {
			for (int j = 0; j < ziffere1[i].length; j++) {
				ziffere1[i][j] = (i + 1) + (j * 3);
				System.out.print( ziffere1[i][j] + " ");		
			}	
			System.out.println();
		}
		
//		int count = 1;
//		for (int i = 0; i < ziffere1.length; i++) {
//			for (int j = 0; j < ziffere1[i].length; j++) {
//				ziffere1[j][i] = count;
//				count++;
//				System.out.print( ziffere1[j][i] + " ");
//			}	
//			System.out.println();
//		}
		
		
	}

}
