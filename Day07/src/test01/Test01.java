package test01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		 2의 제곱 함수
//		 정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//		 hint ) 함수 원형 - public static int getSquared(int x)

		System.out.print(" 제곱값을 구할 숫자를 입력하시오: ");
		int number = scan.nextInt();
		
		System.out.println(number + "의 제곱은  " + getSquared(number) + "입니다.");
		System.out.println();
//		4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//		hint ) 함수 원형 - public static double getAverage(int score1, int score2, int score3, int score4)
		
		System.out.print(" 점수를 입력하시오 : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();
		int score4 = scan.nextInt();
		
		System.out.println("평균은  " + getAverage(score1, score2, score3, score4));
		System.out.println();
//		몫과 나머지 출력 함수
//		두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
//		hint ) 함수 원형 - public static void printQuotientRemainder(int number1, int number2)

		System.out.print("숫자와 나눌 수를 입력하세요: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		printQuotientRemainder(number1, number2);
		
//		홀짝 함수
//		정수를 입력 받아서 짝수면 0 홀수면 1을 돌려 주는 함수를 만드세요.
		System.out.println("숫자를 입력하세요: ");
		int ziffer = scan.nextInt();
		System.out.println(checkUp(ziffer));

	} 
	
	public static int getSquared (int number) {
		int result = number * number;
		return result;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double result = (score1 + score2 + score3 + score4)/4.0;
		return result;
	}
	
	public static void printQuotientRemainder(int number1, int number2) {
		int result1 = number1 / number2;
		int result2 = number1 % number2;
		
		System.out.println("몫과 나머지는 " + result1 + ", " + result2);
		return ;
	}
	
	public static int checkUp (int ziffer) {
		
		return ziffer%2;
	}
	
}
