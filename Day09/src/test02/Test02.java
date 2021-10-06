package test02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
//		문자열 변수를 세개 만들어서 아래 문장의 단어를 하나씩 저장하세요.
//		세 변수를 이용해서 아래 내용 처럼 출력하세요
		String text = " Oh ";
		String text1 = " My ";
		String text2 = " God ";
		
		System.out.println(text + text1 + text2);
		
//		id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
//		Welcome! id
		
		Scanner scan = new Scanner(System.in);
		 String id = scan.next();
		 System.out.println("Welcome " + id);
		
		 System.out.println();
		 
//		 아래와 같이 문장을 입력 하고, 이 문장의 단어를 하나씩 문자열 배열에 저장하세요.
//		 저장된 단어를 한줄에 하나씩 출력하세요.
//		 String[] texts = {"Why", "So", "Serious"};
//		 for (int i = 0; i < texts.length; i++) {
//			System.out.println(texts[i]);
//		}
		 
		 String[] texts1 = new String[3];
		 
		 for (int i = 0; i < texts1.length; i++) {
			 String texts1[i] = scan.next();
			 System.out.print(texts1[i] + " ");
		 }
		 
		
		
	}

}
