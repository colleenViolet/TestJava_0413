package test03;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		자리수 계산
//		수를 입력 받고 해당 수가 몇 자리 수인지 출력하세요.
//		입력 예시
//
//		수를 입력 하세요  : 432153
//		
		System.out.print(" 수를 입력하시오 : ");
		int number = scan.nextInt();
		int count = 0;
		
		while (number != 0) {
			number /= 10;
			count++;
		}
		System.out.println(count);
		
//		 달력 출력 하기
//		 2020년 7월 1일은 수요일이다.
//		 아래와 같이 2020년 7월 달력을 출력하세요.
//		 출력 예제
//		  2020 / 7 
//
//		   S   M   T   W   T   F   S 
//		               1   2   3   4 
//		   5   6   7   8   9  10  11 
//		  12  13  14  15  16  17  18 
//		  19  20  21  22  23  24  25 
//		  26  27  28  29  30  31
		
		System.out.println("2020 / 07 ");
		System.out.println();
		System.out.println("S  M  T  W  T  F  S");
		
		int day = -2;
		 for(int i = 0; i <5; i++) {
			 
			 for(int j = 0; j < 7; j++) {
				 if(day > 0) {
					 if(day < 10) {
						 System.out.print(" ");
					 }
					 System.out.print(day+ " ");
				 }else {
					 System.out.print("   ");
				 }
				 
				 day++;
				 if(day > 31) {
					 break;
				 }
			 }
			 System.out.println();
		 }
		

		
		
	}
}
