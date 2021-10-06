package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//1등 이면 소고기 2등이면 삼겹살 3등이면 치킨 그이외는 라면
		int ranking = scan.nextInt();
		
		switch (ranking) {
		case 1:
			System.out.println("소고기");
			break;
		case 2:
			System.out.println("삼겹살");
			break;
		case 3:
			System.out.println("치킨");
			break;

		default:
			System.out.println("라면");
			break;//default 밑에 있는 break는 굳이 안써도 마지막에 있기 때문에 안해도 된다. 
			//case는 꼭 1개에 따른 결과 값만 산출 하지 않는다 . 여러가지 경우를 같이 쓸수있다.
		}
	}

}
