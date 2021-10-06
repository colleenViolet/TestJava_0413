package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//문자열 선언 초기화
		String text = "Hello World!";
		System.out.println(text);
		
		// 문자열 연산
		int number = 10;
		int number2 = 20;
		
		System.out.println("Hello " + number);
		
		String text2 = "hello" + number;
		text2 = "Hello " + (number + number2);
		
		System.out.println(text2);
		
		//문자열 입력
		Scanner scan = new Scanner(System.in);
		
//		String word = scan.next();
//		System.out.println(word);
		
		String text3 = scan.nextLine();
		// 입력값 \n 까지 입력 된다. 
		//\n 남기 때문에 뒤에 프로그램이 실행되지 않은다고 생각 할 수 있다. 
		//한번더 scan. nextLine ();을 사용해서 문자열을 못받게 하는 \n 을 빼주는 것이다.
		
		System.out.println(text3);
		
		//문자열 배열 
		String[] texts = {"dog", "cats"};
		for (int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
	}
}
