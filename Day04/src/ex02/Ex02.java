package ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//70킬로 이상인 경우 운동을 반복하는 while문을 쓰시오.
		
		System.out.println("몸무게를 입력하세요.");
		int weight = scan.nextInt();
	
		while (weight > 70) {
			System.out.println("운동하자");
			//weight = weight - 4;(아래의 형태를 더 많이 사용한다.)
			weight -= 2;
		}
		//do - while 문 강제 실행 반복문 
		/* 횟수의 상관없이 일단 강제 실행을 하는 경우로 
		 * do{
		 * 실행문}
		 * while(조건) 형태이다.
		 */
		
		// 횟수반복 5번;
		
		int i = 0;
		while(i < 5) {
			System.out.println("Hello world!!"+i);
			i++; // i = i + 1
		}
		
		i = 5;
		while(i > 0) {
			System.out.println("Hallo"+i);
			i--; //i = i - 1
		}
		
		int count =10;
		i = 0;
		while(i < count) {
			System.out.println("replay");
			i++;
		}
		
		//합구하기
		//1부터 10까지의 합을 구하기(누적된 합을 구하기)
		int sum = 0;
		i = 1;
		while(i < 11) {
			sum += i; //sum = sum + i;
			System.out.println("log"+sum);
			i++;
		}
		
		System.out.println(sum);
		
		//값은 밖에서 출력한다. (습관화 해야한다.)
		
		//카운트 패턴
		//짝수의 갯수를 출력하시오 (1-10)
		int count1 = 0;
		i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				count1++;
				System.out.println("log"+count1);
			}
			i++;
		}
		System.out.println(count1);
	}
}
