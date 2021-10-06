package test01;

import java.util.Scanner;

public class Test01_1 {

	public static void main(String[] args) {
		//종합문제 1번
		Scanner scan = new Scanner(System.in);
		
		
//				System.out.println("수를 입력하시오");
//				int ziffer = scan.nextInt();
				int sum = 0;
				
				int i = 1;
//				while(i <= ziffer) {
//					sum += i;
//					i++;
//				}
//				System.out.println("합은"+ sum);
//				
//				i = 0;
//				int number = 0;
//				while(i < 5) {
//					System.out.println((i+1)+"번째 수를 입력하시오");
//					int zahl = scan.nextInt();
//					number += zahl;
//					i++;
//				}
//				System.out.println("총합은 " + number + "평균은 "+(number/5.0));
				
				System.out.println("수를 입력하시오.");
				int number1 =scan.nextInt();
				
				if(number1 <= 10) {
					i = 1;
					sum = 1;
					while(i <= number1) {
						sum *= i;
						i++;
					}
				}else {
					System.out.println("잘못된값을 입력하였습니다.");
				}
				
				System.out.println(number1+"! = "+ sum);
				
//				i = 0;
//				int number1 = 0;
//				while(i < 5) {
//					System.out.println((i+1)+"번째 수를 입력하시오");
//					int zahl1 = scan.nextInt();
//					zahl1 = number1;
//					
//					i++;
//				}
//				질문을 해야 할거 같은 문제 
				

	}

}
