package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		수를 입력 받아서 1부터 입력 받은 수까지의 합을 출력하세요.
		int number1 = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= number1; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
//		반복문으로 5개의 수를 입력 받아서 총합과 평균을 출력하세요.
		//총합관련 변수 선언(초기화)
		sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "번째 수를 입력하시오 : ");
			int number2 = scan.nextInt();
			sum += number2; //sum = sum + number2;
		}
		System.out.println("총합: " + sum + "평균: "+ (sum / 5.0));
		System.out.println();
		
//		팩토리얼은 1부터 그 수까지의 모든 수의 곱이고 아래와 같이 표현된다.
//		5! = 1 * 2 * 3 * 4 * 5
//		7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
//
//		수를 입력 받고 그 수의 팩토리얼을 출력하세요.
//		입력 받는 수의 최대값음 10이다.
		
		int fatorial = 1;
		System.out.println("값을 입력하시오");
		int number = scan.nextInt();
		for (int i = 1; i <= number; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
		
//		반복문으로 5개의 수를 입력 받아서 최소 값을 출력하세요.
//		입력값의 최대 값은 1000 입니다.
		//다시 생각하기(min값...)
		int min = 1000;
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 수를 입력하시오 : ");
			int ziffer = scan.nextInt();
			
			if(min >= ziffer) {
				min = ziffer;
			}
		}
		System.out.println(min);
		System.out.println();
		
//		수를 입력 받아서 그 수의 약수를 모두 출력하세요.
		System.out.print("수를 입력하시오: ");
		int number4 = scan.nextInt();
		
		for(int i = 1; i <= number4; i++) {
			if(number4 % i == 0) {
				System.out.print(i+" ");
			}
		}
		
		
	}
}
