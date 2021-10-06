package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
	
		// 길이 구하기 
		String text = " Hello";
		
		int length = text.length();
		System.out.println(length);
		System.out.println(text.length());
		
		//문자확인하기 
		//char 'a' 'c' 'b'
		//String "abc"
		char character = text.charAt(3);
		
		System.out.println(character);
		
		//charAt 을 이용해서 반복문으로 문자열 출력
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i) + " ");
		}
		
		//문자열 자르기
		String phoneNumber = "01012345678";
		
		//12345678
		String partString = phoneNumber.substring(3);
		System.out.println(partString);
		
		//010
		partString = phoneNumber.substring(0, 3);
		System.out.println(partString);
		
		//1234
		partString = phoneNumber.substring(3, 7);
		System.out.println(partString);
		
		//5678
		partString = phoneNumber.substring(7);
		System.out.println(partString);
		
		//특정문자로 시작
		 text = "김인규";
		 if(text.startsWith("김")) {
			 System.out.println("김씨 입니다.");
		 }
		 
		 if(text.endsWith("인규")) {
			 System.out.println("이름이 인규입니다.");
		 }
		 
		 //문자열 일부 바꾸기
		 String replaceText = text.replace("김", "이");
		 System.out.println(replaceText);
		
		 //문자열 쪼개기
		 text = "김인규, 유재석, 하하, 황광희, 조세호";
		 String[] names = text.split(",");
		 
		 System.out.println(Arrays.toString(names));
		 
	}
}
