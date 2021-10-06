package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
//		무한 루프와 break를 이용해서 Hello World를 8번 출력 하세요.
		int i = 0;
		while(true) {
			if(i == 8) {
				break;
			}
			System.out.println("Hello World!");
			i++;
		}
		
//		continue 를 이용해서 1~10 사이 수 중에 짝수만 출력 하세요.
		for( i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
//		수를 입력 받고 continue 를 이용해서 1~ 100까지 사이의 수중에 입력 받은 수의 배수만 출력 하세요
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수를 입력하시오: ");
		int number = scan.nextInt();
		for( i = 1; i <= 100; i++) {
			
			if (i % number != 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		System.out.println();
		
//		무한 루프를 통해서 반복적으로 수를 입력을 받고 0이 입력 되었을때 반복문을 빠져 나오게 하세요.
//		입력이 끝나면 "끝"을 출력하세요
		
		while(true) {
			System.out.print("수를 입력하시오: ");
			int number1 = scan.nextInt();
			if (number1 == 0) {
				break;
			}
		}
		System.out.println("The End");
	
		
		

	}

}
