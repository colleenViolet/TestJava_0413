package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		int number = scan.nextInt();
		if (number > 0) {
			System.out.println("양수입니다.");
		}else if (number == 0) {
			System.out.println( number + "는 0과 같습니다.");
		}else if (number < 0) {
			System.out.println("음수입니다.");
		}
		
		System.out.println("점수를 입력하시오");
		int grade = scan.nextInt();
		
		if (grade >= 90) {
			System.out.println("A");
		}else if (grade >= 80) {
			System.out.println("B");
		}else if (grade >= 70) {
			System.out.println("C");
		}else if (grade >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
