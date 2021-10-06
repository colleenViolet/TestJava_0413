package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몸무게를 입력하시오.");
		int weight = scan.nextInt();
		
		if (weight <= 70) {
			System.out.println("치킨을 먹자.");
		}
		if (weight >= 90) {
			System.out.println("다이어트를 합시다.");
		}
		if (weight == 68) {
			System.out.println("저의 몸무게는 "+weight+"kg 입니다.");
	
		}
		
		boolean isTrue = weight <= 70;
		System.out.println(isTrue);
		
		
		
	}

}
