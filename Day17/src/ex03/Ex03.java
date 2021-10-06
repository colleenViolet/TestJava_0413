package ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
	
	public static void main(String[] args) {
		//과일이름 리스트
		List<String> fruits = new ArrayList<>();
		fruits.add("apfel");
		fruits.add("anana");
		fruits.add("banana");
		
		//반복문으로 과일이름접근하기 
		//인덱스 기반
		for (int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i)+ " ");
			
			String elements = fruits.get(i);
			if (elements.startsWith("b")) {
				fruits.remove(i);
			}
		}
		System.out.println();
		
		//향상된 for문 : for each / for in
		
		for (String element : fruits) {
			System.out.print(element + " ");
			if (element.startsWith("b")) {
				fruits.remove(element);
			}
		}
		System.out.println();
		
		//Iterator
		Iterator<String> iter = fruits.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.print(element + " ");
			if (element.startsWith("b")) {
				fruits.remove(element);
			}
			
		}
		System.out.println();
		
	}

}
