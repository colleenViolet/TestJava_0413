package test02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(5);
		set2.add(6);
		set2.add(3);
		set2.add(4);
		
		Set<Integer> union= new HashSet<>();
		union.addAll(set1);
		union.addAll(set2);
		
		System.out.println("합집합 : " + union);
		
		Set<Integer> intersection = new HashSet<>();
		intersection.addAll(set1);
		intersection.retainAll(set2);
		
		System.out.println("교집합 : " + intersection);
		
		Set<Integer> difference = new HashSet<>();
		difference.addAll(union);
		difference.removeAll(set2);
		
		System.out.println("차집합 : " + difference);
		
	}
}
