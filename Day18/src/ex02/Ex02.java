package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//수학의 집합과 같은 친구 = set
		//중복을 허락 하지 않고 순서가 없는 바구니 또는 주머니라고 생각 하면 쉽다.
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(5);
		set1.add(15);
		
		System.out.println( set1);
		
		set1.add(10);
		System.out.println(set1);
		System.out.println(set1.add(19));
		if(!set1.add(10)) {
			System.out.println("중복되었습니다. ");
		}
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(40);
		set2.add(10);
		set2.add(5);
		set2.add(35);
		
		System.out.println(set2);
		//교집합
//		set1.retainAll(set2);
//		System.out.println(set1);
		//합집합
		set1.addAll(set2);
		System.out.println(set1);
		//수정
		set1.remove(19);
		System.out.println(set1);
		
		//트리셋
		//정렬이 기본인 셋이다. 그렇기 때문에 보는 것이 가장 쉽다. 
		//하지만 해쉬셋 보다 속도면에서 낮을 가능 성이 있다. 
		
		Set<Integer> set3 = new TreeSet<>();
		set3.add(1);
		set3.add(16);
		set3.add(4);
		set3.add(8);
		set3.add(12);
		
		System.out.println(set3);
		
		for(Integer number : set3) {
			System.out.print(number + " ");
		}
		
		System.out.println();
		
		Iterator<Integer> iter = set2.iterator();
		while (iter.hasNext()) {
			Integer number = iter.next();
			System.out.print(number + " ");
			
		}
 	}

}
