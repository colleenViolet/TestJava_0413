package ex04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(30);
		numbers.add(65);
		numbers.add(120);
		numbers.add(89);
		numbers.add(12);
		
		//값 찾기 
		if (numbers.contains(30)) {
			System.out.println("존재합니다. ");
		}
		
		//정렬
		// 버블 소트, 선택정렬, 삽입 정렬, 퀵 소트 .........
		//공부해보면 좋은 정렬 코딩
		
		//작은 것 부터 차례로 
		numbers.sort(Comparator.naturalOrder());
		System.out.println(numbers);
		//역 순으로, 큰것 부터 작은것 순으로
		numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers);
		
		numbers.clear();
		if (numbers.isEmpty()) {
			System.out.println("값을 입력하시오");
		}
	}

}
