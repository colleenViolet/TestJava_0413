package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수를 입력하시오");
		int number1 = scan.nextInt();
		
		if(number1 > 10) {
			System.out.println(number1 +"은 10보다 큽니다.");
		}else if(number1 == 10) {
			System.out.println(number1+"은 10과 같습니다.");
		}else if(number1 < 10) {
			System.out.println(number1+"은 10보다 작습니다.");
		}
		
		System.out.println("두수를 입력하시오");
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		if(number2 == number3) {
			System.out.println("=");
		}else if(number2>number3) {
			System.out.println(">");
		}else if (number2 < number3) {
			System.out.println("<");
		}
		
		System.out.println("성적을 입력하시오.");
		int grade = scan.nextInt();
		if (grade >= 70) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println("수를 입력하시오");
		int number4 = scan.nextInt();
		int etwas= number4%2;
		if(etwas == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
		
	}

}
