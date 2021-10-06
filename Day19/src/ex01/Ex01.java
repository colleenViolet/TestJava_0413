package ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
		//Hash 의  의미 
		/* 특정한 값에 Hash function을 이용하면 16진수의 중복 되지 않는 수로 변환한다.
		 * 기존의 파일과 같은 파일을 찾는 경우에 편히 이용할수 있다. 
		 * *hashing에 대해서는 따로 더 공부 하는 것이 더 좋다. 
		 */
		
		//예제
		Map<String, String> ids = new HashMap<>();
		
		ids.put("hagulu", "김인규");
		ids.put("yu", "유재석");
		
		System.out.println(ids);
		
		//하나하나 값 가져오기
		System.out.println(ids.get("hagulu"));
		
		//값 바꾸기
		ids.put("yu", "박명수");
		System.out.println(ids.get("yu"));
		
		//키 존재 여부 확인
		if(ids.containsKey("yu")) {
			System.out.println(ids.get("yu"));
		}
		
		//value 값이 존재 하는 지 확인 
		if(ids.containsValue("김인규")) {
			System.out.println(" 존재 합니다. ");
		}
		
		//값 추가 
		//다른 맵에 있는 모든 값 추가 
		Map<String, String> newMap = new HashMap<>();
		newMap.put("lee", "이효리");
		newMap.put("rain", "정지훈");
		
		ids.putAll(newMap);
		
		System.out.println(ids);
		
		//값 지우기 
		ids.remove("hagulu");
		System.out.println(ids);
		
		//반복문을 통한 접근
		//모든 키 가져 오기 .
		 Set<String> keys = ids.keySet();
		 
		 
		 //향산된 for문
		 for (String id : keys) {
			System.out.println(id + " : " + ids.get(id));
		}
		 
		 //Iterator
		 Iterator<String> iter = ids.keySet().iterator();
		 while (iter.hasNext()) {
			String id =  iter.next();
			
			System.out.println(id + " : " + ids.get(id));
		}
		
		
	
	}

}
