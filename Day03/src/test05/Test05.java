package test05;

import java.util.Scanner;

public class Test05 {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세개의 수를 입력하세요");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		int check1 = number1%2;
		int check2 = number2%2;
		int check3 = number3%2;
		
		if (check1 == 0) {
			System.out.println(number1 + "은 짝수입니다.");
		}else {
			System.out.println(number1 + "은 홀수입니다.");
		}
		if (check2 == 0) {
			System.out.println(number2 + "은 짝수입니다.");
		}else {
			System.out.println(number2 + "은 홀수입니다.");
		}
		if (check3 == 0) {
			System.out.println(number3 + "은 짝수입니다.");
		}else {
			System.out.println(number3 + "은 홀수입니다.");
		}
		
		System.out.println("\n Bmi지수를 입력하시오");
		
		int bmi = scan.nextInt();
		
		if(bmi <= 10) {
			System.out.println("정상입니다.");
		}else if(bmi <= 20) {
			System.out.println("과체중입니다.");
		}else {
			System.out.println("비만입니다.");
		}
		
		System.out.println("\n 두점수를 입력하시오");
		int grade1 = scan.nextInt();
		int grade2 = scan.nextInt();
		
		double average =(grade1+grade2)/2.0;
		
		if (average >= 70) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println("\n 세수를 입력하세요");
		int ziffer1 = scan.nextInt();
		int ziffer2 = scan.nextInt();
		int ziffer3 = scan.nextInt();
//		
//		if(ziffer1 > ziffer2) {
//			if(ziffer1 > ziffer3) {
//				System.out.println(ziffer1);
//			}else if(ziffer3 >ziffer2){
//				System.out.println(ziffer3);
//			}
//		}else {
//			if(ziffer2 > ziffer3) {
//				System.out.println(ziffer2);
//			}else if(ziffer3 > ziffer1) {
//				System.out.println(ziffer3);
//			}
//		}
		
		
		
		//경연 프로그램 관련해서 코딩을 한다면 
		
		int max = ziffer1;
		
		if(ziffer2 > max) {
			max = ziffer2;
			System.out.println("2가 더 커서 출력 되었다");
		}
		if(ziffer3 > max) {
			max = ziffer3;
			System.out.println("3이 더 커서 교체 되었다.");
		}
		
		System.out.println(max);
				
		
		System.out.println("원하는 달을 입력하시오");
		int month = scan.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		
		default :
			System.out.println("잘못된 입력 값입니다.");
			break;
	
		}
	}
}
