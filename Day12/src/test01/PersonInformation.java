package test01;

import javax.xml.crypto.Data;

public class PersonInformation {
	String name;
	String birth;
	String gender;
	
	//나이 구하기 
	int getAge(int thisYear) {
//		String yearString = birth.substring(0, 4);
//		int year = Integer.parseInt(yearString);
		
		//한줄 만들기 
		int year = Integer.parseInt( birth.substring(0, 4)) ;
		return thisYear - year + 1;
		
	}
	void greetig(int thisYear) {
		System.out.println("안녕하세요" + name + "입니다. ");
		System.out.println("저는 " + getAge(thisYear) + "살 " + gender + "입니다. ");
	}
	//나이를 비교하는 함수
	int compareAge(PersonInformation person){
		//this
		int thisYear = Integer.parseInt(this. birth.substring(0, 4)) ;
		System.out.println(thisYear);
		int targetYear = Integer.parseInt( person.birth.substring(0, 4)) ;
		System.out.println(targetYear);
		//결과가 음수면 파라미터로 받은 객체의 나이가 더 많다. 
		//결과가 양수면 파라미터로 받은 객체의 나이가 더 적다. 
		// 결과가 0이면 둘은 동갑이다. 
		
		return thisYear - targetYear;
	}
}
