package test02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
//		두 수를 입력 받아서 두수의 범위 만큼의 구구단을 출력하세요.
		System.out.println("단수의 범위를 입력하시오 : ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		for(int i = number1; i <= number2; i++ ) {
			for (int j = 1; j <= 9; j++) {
				System.out.println( i + "X" + j +" = " + (i * j));
			}
		}
		System.out.println();
		
//		수를 입력 받고 그 줄 수만큼 아래 형태처럼 *을 출력하세요
	   System.out.print("출력할 줄 수를 입력하시오: ");
	   int number3 = scan.nextInt();
	   
	   for(int i = 0; i < number3; i++) {
		   for (int j = 0; j < number3-i; j++) {
			   System.out.print(" ");
		   }
		   for(int j = 0; j < (2*i)+1; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   
//	   모래시계의 크기를 나타내는 홀수의 정수(3 <= n < 99)를 입력받고 모래시계 모양을 출력하세요.
//	   *+*+*
//	   -*+*-
//	   --*--
//	   -*+*-
//	   *+*+*
	  
	   System.out.println(" 모래시계의 크기를 입력하시오 (3 <= n < 99) : ");
	   int level = scan.nextInt();
	   int half = level / 2;
	   
	   
	   for(int i = 0; i < half + 1; i++ ) {
		   //앞에 있는 -의 형태 찍기 
		   for(int j = 0; j < i; j++) {
			   System.out.print("-");
		   }
		   //중간의 *, +를 번갈아서 찍는 방법 (짝수와 홀수 구분)
		   for(int j = 0; j < (half - i)*2 + 1; j++) {
			   if(j % 2 == 0) {
				   System.out.print("*");
			   }else {
				   System.out.print("+");
			   } 
		   }
		   //남은 -형태로 찍어주는 것
		   for(int j = 0; j < i; j++) {
			   System.out.print("-");
		   }
		   
		   System.out.println();
	   }
	   
	   //모래시계의 밑에 부분 작업 
	   for(int i = 0; i < half; i++) {
		   //역삼각형으로 -찍기
		   for(int j = 0; j < half - i - 1; j++) {
			   System.out.print("-");
		   }
		   // 피라미드형태로 *, + 작업 하기 
		   for(int j = 0; j < (i + 1 ) * 2 + 1; j++) {
			   if(j % 2 == 0) {
				   System.out.print("*");
			   }else {
				   System.out.print("+");
			   }
		   }
		   // 남은 부분 - 찍기
		   for(int j = 0; j < half - i - 1; j++) {
			   System.out.print("-");
		   }
		   System.out.println();
	   }
		
//		삼각형의 크기를 나타내는 양의 정수 3 <= n <= 99를 입력받고 숫자 삼각형을 출력하세요.
//				입력 예시
//
//				숫자 삼각형의 크기를 입력하세요: 3
//				출력 예시
//
//				1
//				2 4
//				3 5 6
		
		System.out.println(" 숫자 삼각형의 크기를 입력하시오: ");
		int size =scan.nextInt();
		int number = 0;
		// 가로로 숫자 나열하기 
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < i + 1; j++) {
				number++;
				System.out.print(number +" ");
				
			}
			System.out.println();
		}
		System.out.println();
	   //위의 내용처럼 나열하고 싶을 때, 
		for(int i = 0; i < size; i++) {
			 number = i+1;
			for(int j = 0; j < i + 1; j++) {
				System.out.print(number +" ");
				number += (size - 1) - j;
			}
			System.out.println();
		}
	}
}
