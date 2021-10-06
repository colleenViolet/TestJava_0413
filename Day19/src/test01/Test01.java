package test01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> grad = new HashMap<>();
		
		grad.put("국어", 90);
		grad.put("수학", 85);
		grad.put("영어", 90);
		grad.put("사회", 80);
		grad.put("과학", 100);
		
		System.out.println(grad);
		
		grad.put("사회", 85);
		
		System.out.println(grad);
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("조회 할 과목명을 입력하시오 : ");
		String subject = scan.next();
		
		if(grad.containsKey(subject)) {
			System.out.println(subject + " : " + grad.get(subject));
		}else {
			System.out.println("자료 없음");
		}
	
		Set<String> keys = grad.keySet();
		Set<String> subjects = new HashSet<>();
		
		Iterator<String> iter = grad.keySet().iterator();
		while (iter.hasNext()) {
			String  key = iter.next();
			
			if(grad.get(key) >= 90) {
				subjects.add(key);
			}
		}
		
		System.out.println( subjects);
		
		if(grad.containsValue(100)) {
			System.out.println("수상가능");
		}
	
	}

}
