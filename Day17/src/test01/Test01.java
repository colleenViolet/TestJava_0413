package test01;


import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		//값을 한번에 저장 하는 일은 별로 많이 없는 일이다. 
		//배열을 만들고 그 뒤에 List<Integer> integerList = new Array.asList(배열의 형태);
		//위의 형태로 사용한다. 
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(3);
		integerList.add(8);
		integerList.add(9);
		integerList.add(4);
		integerList.add(2);
		integerList.add(1);
		integerList.add(7);
		integerList.add(5);
		
		System.out.println(integerList);
		
		integerList.set(3, 6);
		System.out.println(integerList);
		
		integerList.add(2, 10);
		System.out.println(integerList);
		
		integerList.remove(1);
		integerList.remove(6);
		System.out.println(integerList);
		
		
	}

}
