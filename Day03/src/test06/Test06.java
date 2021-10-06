package test06;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 점수를 입력하시오");
		int grade1 = scan.nextInt();
		int grade2 = scan.nextInt();
		
		double average = (grade1 + grade2)/2.0;
		
		if (grade1 <= 50 || grade2 <= 50) {
			System.out.println("과락");
		}else if(average >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("\n 년도를 입력하시오");
		int year = scan.nextInt();
		int etwas = year%4;
		int etwas1 = year%100;
		int etwas2 = year%400;
		
		//내가 푼 코드 다시 생각하기 
		
//		if(etwas == 0 ) {
//			if(etwas1 == 0) {
//				System.out.println("윤년이 아닙니다.");
//			}else if(etwas2 == 0) {
//				System.out.println("윤년입니다.");
//			}
//		}else {
//			System.out.println("윤년이 아닙니다.");
//		}
		
		if(etwas2 == 0 || (etwas == 0 && etwas1 != 0)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
		System.out.println("\n 영희의 차례입니다. 1에서 3 사이의 수를 입력하시오");
		int girl = scan.nextInt();
		System.out.println("철수의 차례 입니다. 1에서 3 사이의 수를 입력하시오");
		int boy = scan.nextInt();
		
//		if(girl < boy) {
//			if (boy == 3 && girl ==1) {
//				System.out.println("영희가 이겼다.");
//			}else {
//				 System.out.println("철수가 이겼다.");
//			}
//		}else if(girl == boy) {
//			System.out.println("비겼습니다.");
//		}else {
//			if (boy == 1 && girl == 3) {
//				System.out.println("철수가 이겼다.");
//			}else {
//				 System.out.println("영희가 이겼다.");
//			}
//		}
		
		if(girl == boy) {
			System.out.println("비겼습니다.");
		}else if (boy == 3 && girl ==1 ||
				boy == 2 && girl == 3 ||
				boy == 1 && girl == 2 ) {
			System.out.println("영희가 이겼습니다.");
		} else {
			System.out.println("철수가 이겼습니다. ");
		}
		
		
		System.out.println("시간과 분을 입력하시오");
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		
		if(minute >= 45) {
			System.out.println(hour+"시"+(minute-45)+"분");
		}else {
			System.out.println((hour-1)+"시"+(minute+15)+"분");
		}
		
		System.out.println(" 윷을 던지고, 뒤집어진 상태를 입력하시오. (뒤집힌 경우 1, 아닌경우 0)");
		int frist = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		int forth = scan.nextInt();
		int number = (frist + second + third + forth);
		
		switch(number) {
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
			
		default:
			System.out.println("잘못 입력하였습니다.");
			break;
			
		}
	}

}
