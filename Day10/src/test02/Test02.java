package test02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
//		파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		
		int count = 0;
		for(int i = 0; i < files.length; i++) {
			if(files[i].endsWith("jpg")) {
				count++;
			}
		}
		
		System.out.println("jpg 파일의 갯수는 " + count);
		
//		영어 단어 퀴즈를 낸다.
//		아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
//		100점 만점 기준으로 몇점인지 출력한다.
//			1. 승리을 영어로 입력하세요 :
//			2. 사랑을 영어로 입력 하세요 :
//			3. 컴퓨터를 영어로 입력 하세요 :
//			4. 노트북을 영어로 입력하세요 :
		int grade = 0;
		
		System.out.print("1. 승리을 영어로 입력하세요 :");
		String answer = scan.nextLine();
		if(answer.equals("victory")) {
			grade = 25;
		}
		
		System.out.println("2. 사랑을 영어로 입력 하세요 :");
		String answer1 = scan.nextLine();
		if(answer1.equals("love")) {
			grade += 25;
		}
		
		System.out.println("3. 컴퓨터를 영어로 입력 하세요 :");
		String answer2 = scan.nextLine();
		if(answer2.equals("computer")) {
			grade += 25;
		}
		
		System.out.println("4. 노트북을 영어로 입력하세요 :");
		String answer3 = scan.nextLine();
		if(answer3.equals("notebook")) {
			grade += 25;
		}
		
		System.out.println(grade + "점 입니다.");
//		
//		회원 명부가 아래와 같이 문자열이 저장 되어 있다. 같은 이름이 몇개 인지 출력하세요.
		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재:이민정";
		
		// 문자열 특정 문자열 기준으로 나눈다. [쪼갠다]
		String[] names = membersString.split(":");
		
		//중복 찾기 패턴
		//찾을 대상을 선택 
		
		int equalsCount = 0;
		for (int i = 0; i < names.length; i++) {
			 count = 0;
			for (int j = i + 1; j < names.length; j++) {
				//예외 처리 
				if(names[i].equals("")) {
					continue;
				}
				
				//같은 이름이 2개 이상 있는 경우 사용한다. 
				if(names[i].equals(names[j])) {
					names[j] = "";
					count++;
				}
			}
			//각각의 사람들의 같은 이름의 경우를 찾고 그 이후 변수의 값을 증가시켜서 일을 처리 하는 것이 합리적이다. 
			//이문제 같은 경우 많이 고민 하는 것이 가장 좋다. 
			if(count >= 1) {
				equalsCount ++;
			}
		}
		
		System.out.println(equalsCount + "명의 동명이인이 존재 합니다.");
		
		
		
		
		
	}

}
