package test03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
//		 id 중복 체크
//		 아래와 같이 회원 가입된 id 목록이 주어진다.
//		 ["hagulu", "happy", "google", "bts", "iu", "cuteboy"]
//		 id 를 입력 받고, id 가 중복 될경우 "중복입니다", 중복이 되지 않을 경우 "사용가능" 을 출력 하세요.
		 
		List<String> idList = new ArrayList<>();
		idList.add("hagulu");
		idList.add("happy");
		idList.add("google");
		idList.add("bts");
		idList.add("iu");
		idList.add("cuteboy");
		
		System.out.println(idList);
		
		String id = scan.next();
		
//		for (int i = 0; i < idList.size(); i++) {
//			if(id.equals(idList.get(i))) {
//				System.out.println("중복입니다. ");
//			}
//		}
		
		if (idList.contains(id)) {
			System.out.println("중복입니다.");
		}
		
//		체조 경기 평균 점수
//		체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
//		최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//		for문으로 구현할 것
		
		List<Integer> countList = new ArrayList<>();
		countList.add(8);
		countList.add(7);
		countList.add(6);
		countList.add(10);
		countList.add(9);
		countList.add(4);
		
		countList.sort(Comparator.naturalOrder());
		countList.remove(5);
		countList.remove(0);
		
		int sum = 0;
		
		Iterator<Integer> iter = countList.iterator();
		while(iter.hasNext()) {
			int score = iter.next();
			sum += score;
		}
		
//		int sum = 0;
//		for (int i = 0; i < countList.size(); i++) {
//			sum += countList.get(i);
//		}
		System.out.println("최고점과 최저점을 제외한 평균은 "+ (sum /(double)countList.size()));
		
//		로또 번호
//		Random 클래스를 이용해서 1~45 범위의 6개의 중복 되지 않는 숫자를 리스트에 저장 하세요.
//		저장된 숫자를 오름 차순으로 정렬해서 출력 하세요.
		
		List<Integer> lottoNumberList = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			int randomNumber = rand.nextInt(45)+ 1;
			if(lottoNumberList.contains(randomNumber)) {
				   i--;
				   continue;
			   }
			lottoNumberList.add(randomNumber); 
		}
		
		lottoNumberList.sort(Comparator.naturalOrder());
		System.out.println(lottoNumberList);
		
//		회원 추가하기
//		회원관리 리스트를 만든다.
//
//		[우솝, 루피, 상디, 나미, 로빈]
//		새로 입력할 이름을 기존 리스트에 추가한다.
//		만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
//		(새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)
		
		List<String> nameList = new ArrayList<>();
		nameList.add("우솝");
		nameList.add("루피");
		nameList.add("상디");
		nameList.add("나미");
		nameList.add("로빈");
		
		List<String> newMembers = new ArrayList<>();
		newMembers.add("프랑키");
		newMembers.add("루피");
		newMembers.add("쵸파");
		newMembers.add("로빈");
		newMembers.add("루피");
		
		for (int i = 0; i < newMembers.size(); i++) {
			String newMember = newMembers.get(i);
			int count = 1;
			while(nameList.contains(newMember)) {
				newMember = newMembers.get(i) + count;
				count++;
			}
			nameList.add(newMember);
		}
 		
		System.out.println(nameList);
		
	}
	
	

}
