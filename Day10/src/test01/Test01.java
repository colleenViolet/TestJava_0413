package test01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
//		영어 단어를 입력 받고 'e' 가 몇개 들어 있는지 출력 하세요.
		
		System.out.println("단어를 입력 하세요 : ");
		String word = scan.nextLine();
		
		int count =0 ;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println();
//		아래 문자열에서 A 를 B로 바꿔서 출력 하세요
		
		String gradString = "My grade is A";
		String changeGradString = gradString.replace("A", "B");
		System.out.println(changeGradString);
		
//		아래와 같이 전화번호가 저장 되어 있을때 출력예시와 같은 형태로 -를 포함하여 출력하세요.
		
		String phoneNumber = "01012345678";
		String partPhoneNumber1 = phoneNumber.substring(0, 3);
		String partPhoneNumber2 = phoneNumber.substring(3, 7);
		String partPhoneNumber3 = phoneNumber.substring(7);
		
		System.out.print(partPhoneNumber1 + "-" + partPhoneNumber2 + "-" + partPhoneNumber3);
		System.out.println();
//		아래와 같이 생년월일이 저장된 String 이 있을때 올해 나이를 출력 하세요 (한국나이)
		String gradString1 = "19950721";
		String partGradString = gradString1.substring(0, 4);
		int stringToNumber = Integer.valueOf(partGradString);
		
//		int birth = Integer.parseInt(gradString1);
//		int year = birth/10000;
		
		System.out.println("1995년생의 나이는 " + (2022 - stringToNumber) + "입니다.");
		
//		아래 문자열의 단어 개수를 출력 하세요.(중복 포함)
		
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] words = sentence.split(" ");
		
		System.out.println(words.length);
		
		
		
		
	}

}
