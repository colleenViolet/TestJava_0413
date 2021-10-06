package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("걸음수와 몸무게를 입력하시오");
		int weight = scan.nextInt();
		int toWalk = scan.nextInt();
		
		//걸음수가 만보 이상이고 몸무게가 70이하이면 
		if (toWalk >= 10000 && weight <= 70) {
			System.out.println("치킨 먹자.&&");
		}
		
		//걸음수가 만보 이상이거나  몸무게가 70이하이면
		if (toWalk >= 10000 || weight <= 70) {
			System.out.println("치킨먹자 ||");
		}
		
		int number = scan.nextInt();
		if(number >= 10 && number <= 40) {
			System.out.println("참입니다.");
		}
		
		if(number < 10 || number > 40) {
			System.out.println("참입니다.");
		}
	
	}

}
