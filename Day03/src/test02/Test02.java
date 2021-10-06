package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두수를 입력하시오");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		if(number1 >= 70 && number2 >= 70) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println("수를 입력하시오.");
		int number3 = scan.nextInt();
		int etwas = number3%3;
		int ziffer = number3%2;
				
		if(etwas == 0 && ziffer == 0) {
			System.out.println(number3+"는 2와 3의 공배수 입니다.");
		}
		
		System.out.println("1과 10 사이의 수를 입력하시오");
		int number4 = scan.nextInt();
		
		if(number4 > 10 || number4 < 1) {
			System.out.println("잘못 입력하였습니다.");
		}else {
			System.out.println(number4 + "는 1과 10 사이의 숫자 입니다.");
		}
		
	}

}
