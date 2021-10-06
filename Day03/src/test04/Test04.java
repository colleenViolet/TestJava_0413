package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		 System.out.println("1~7 사이의 날짜를 입력하시오");
		int days = scan.nextInt();
	
				
		switch (days) {
		case 1 :
			System.out.println(days+"일은 수요일입니다.");
			break;
		case 2 :
			System.out.println(days+"일은 목요일입니다.");
			break;
		case 3 :
			System.out.println(days+"일은 금요일입니다.");
			break;
		case 4 :
			System.out.println(days+"일은 토요일입니다.");
			break;
		case 5 :
			System.out.println(days+"일은 일요일입니다.");
			break;
		case 6 :
			System.out.println(days+"일은 월요일입니다.");
			break;
			
		case 7 :
			System.out.println(days+"일은 화요일입니다.");
			break;
			
		default :
			System.out.println("잘못입력된 값입니다.");
			break;
		
		}
		
		
		
	}
}
