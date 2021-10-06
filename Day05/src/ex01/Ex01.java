package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//횟수 반복
		//Hello World!! 반복 5회
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello World!");
		}
		
		//숫자 출력 (1 - 5)
		for(int i = 1; i <= 5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//카운트 다운
		//5-0
		for(int i = 5; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		//입력 받은 수 만큼 반복
		int count = scan.nextInt();
		for(int i = 0; i < count; i++) {
			System.out.println("Hello");
		}
		
		int weight = scan.nextInt();
		//70이상인 경우 반복운동
		for( ; weight >= 70; weight -= 2) {
			System.out.println("운동하자");
		}
		
		//합 구하기
		int sum = 0;
		//1 - 10
		for(int i = 1; i <= 10; i++) {
			sum += i;//sum = sum+i; 값을 누적한다. 
		}
		System.out.println(sum);
		
		//for(;;){  } => 무한 반복 시킨다. 
		//while (true) {  }이랑 같다. 
		
	
		
	}

}
