package ex02;


import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
//		데이터를 빠르고 쉽게 저장하고, 삭제하고, 탐색하기 위한 방법을 자료 구조 라고 한다.
//		Java 에서 사용 가능한 자료구조를 Collection 이라고 한다.
		
//		List
//		배열과 같이 같은 타입의 여러개의 자료를 저장하는 자료구조.
//		배열이가진 메모리 낭비와 삽입 삭제의 불편함을 개선하였다.
//		기본 타입은 사용 불가능 하고 객체형태로만 저장 가능하다.
//		generic을 활요애서 타입의 안정성을 확보한다.
//		ArrayList<Integer> integerList = new ArrayList<>();	
		
		//리스트생성
		ArrayList<Integer> integerList = new ArrayList<>();
		
		//값 추가
		integerList.add(20);
		integerList.add(50);
		
		System.out.println(integerList);
		
		//값 삽입
		integerList.add(1, 30);
		System.out.println(integerList);
		
		//값하나만 확인 
		Integer number = integerList.get(2);
		int number2 = integerList.get(0);
		System.out.println(number);
		System.out.println(number2);
		
		//값 수정
		integerList.set(1, 10);
		System.out.println(integerList);
		
		//값 삭제
		integerList.remove(2);
		System.out.println(integerList);
		
		//모두 삭제
		integerList.clear();
		System.out.println(integerList);
		
		//문자열 리스트
		List<String> stringList = new ArrayList<>();
		stringList.add("학교");
		stringList.add("수업");
		
		System.out.println(stringList);
		
		
	}
}
