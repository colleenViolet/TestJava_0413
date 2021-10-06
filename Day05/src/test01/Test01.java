package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
//		35 ~ 40 까지 출력 하세요
		int number = 35;
		for(int i = 0; i < 6; i++) {
			System.out.print((number + i) + " ");
		}
		System.out.println();
		
//		5 ~ -5 까지 출력하세요
		number = 5;
		for(int i = 0; i < 11; i++) {
			System.out.print((number - i) + " ");
		}
		System.out.println();
		
//		1 ~ 50 사이에 3의 배수만 출력하세요.
//		for(int i = 0; i < 51; i++) {
//			if (i % 3 == 0 && i > 1) {
//				System.out.print(i + " ");
//			}
//		}
		for (int i = 3; i < 51; i += 3) {
			System.out.print(i + " ");;
		}
		System.out.println();

//		1 ~ 100 사이에 7의 배수 갯수를 구하세요.
		int count1 = 0;
//		for(int i = 1; i <= 100; i++) {
//			if (i % 7 == 0) {
//				count1++;
//			}
//		}
//		System.out.println("7의 배수의 갯수는 "+count1);
		
		for (int i = 7; i < 100; i += 7) {
			count1++;
		}
		System.out.println("7의 배수의 갯수는 " + count1);
		System.out.println();
		
//		수를 입력 받아서 해당하는 단수의 구구단을 출력 하세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("수를 입력하시오");
		int count = scan.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(count + "X" + i + "= " +(count * i));
		}
		
//		for를 이용해서 5개의 수를 입력 받고 제일 큰수를 출력하세요
		int number1 = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("수를 입력 하세요: ");
			int number2 = scan.nextInt();
		    if (number1 <= number2) {
		    	number1 = number2;
		    }
		}
		System.out.println(number1);
		
		
	}

}
