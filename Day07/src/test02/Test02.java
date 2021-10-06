package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		합 구하기
//		수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
//		단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
		
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		System.out.println(getSum(number));
		
		
	}
	 public static int getSum(int number) {
		int result = 0;
		for(int i = 1; i <= number; i++) {
			result += i;
			while(result > 100) {
				return result;
			}
		}
	}
	
	

}
