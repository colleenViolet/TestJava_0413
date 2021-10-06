package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 횟수를 입력하시오. ");
//횟수 변수 받기
		int count = scan.nextInt();
//카운트 할 변수 i 입력
		int i = 0;
		while(i < count) {
			System.out.println("응 아니야");
			i++;
		}
		
//수를 입력 받고 그 수에서 부터 0 까지 한줄씩 카운트 다운을 출력 하고 마지막에 "발사"를 출력하세요.	
		
		System.out.println("카운트 다운을 입력하세요");
		int count1 = scan.nextInt();
//		while(count1 >= -1) {
//			if(count1 == -1) {
//				System.out.println("발사");
//			}else {
//				System.out.println(count1);
//			}
//			count1--; //i = i - 1
//		}
// 굳이 반복문내에 넣을 필요가 없는 경우. 안넣어도 된다. i의 증감 을 어디에 넣을지 잘 확인 해야 한다.
		
		while(count1 >= 0) {
			System.out.println(count1);
			count1--; //i = i - 1
		}
		System.out.println("발사");
		
//수를 입력 받고 그 수에서 부터 0 까지 한줄씩 카운트 다운을 출력 하고 마지막에 "발사"를 출력하세요.	
		
		System.out.println("수를 입력하시오");
		int number = scan.nextInt();
		int sum = 0;
		
		i = 1;
		while(i <= number) {
			if(i % 2 == 0) {
				sum += i;
			}
				i++;
		}
		System.out.println("더한값은"+sum);
		
//while을 이용하여 5번 동안 수를 입력 받고 출력하세요.
		
		i = 0;
		while(i < 5) {
			System.out.println("입력: ");
			int number1 = scan.nextInt();
			System.out.println("출력 :"+number1);
			i++;
		}
		
//구구단 2단을 출력하세요
		
		i = 1;
		while(i <= 9) {
			System.out.println("2X"+i+"="+(2*i));
			i++;
		}
		
	
	}

}
