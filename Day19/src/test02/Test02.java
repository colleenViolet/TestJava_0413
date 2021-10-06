package test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	 public static final Map<String, String> capitalMap = new HashMap<String, String>() {
	        {
	            put("대한민국", "서울");
	            put("덴마크", "코펜하겐");
	            put("독일", "베를린");
	            put("러시아", "모스크바");
	            put("벨기에", "브뤼셀");
	            put("브라질", "브라질리아");
	            put("스웨덴", "스톡홀름");
	            put("스위스", "베른");
	            put("스페인", "마드리드");
	            put("아르헨티나", "부에노스아이레스");
	            put("이집트", "카이로");
	            put("이란", "테헤란");
	            put("이탈리아", "로마");
	            put("일본", "도쿄");
	            put("필리핀", "마닐라");
	            put("핀란드", "헬싱키");
	            put("프랑스", "파리");
	            put("터키", "앙카라");
	            put("캐나다", "오타와");
	            put("콜롬비아", "보고타");
	        }
	    };
	
	public static void main(String[] args) {
		
		Map<String, String> names = new HashMap<>();
		names.put("유재석", "X");
		names.put("박나래", "X");
		names.put("이지은", "X");
		names.put("서장훈", "X");
		names.put("이광수", "X");
		
		System.out.println(names);
		
		Set<String> name = names.keySet();
		
		Iterator<String> iter = names.keySet().iterator();
		while (iter.hasNext()) {
			String naam = iter.next();
			if(naam.startsWith("이")) {
				names.put(naam, "O");
			}		
		}
		
		System.out.println(names);
		
		/*
		 *  랜덤으로 뽑힌 나라의 수도 이름을 맞추는 게임
			나라-수도가 들어있는 20개의 쌍이 주어진다.
			이 중 랜덤으로 5개의 문제가 주어지고, 사용자로부터 나라에 해당하는 수도를 입력 받는다.
			정답인지 아닌지 수도를 입력한 즉시 출력한다.
			모두 풀고 나면 점수(100점 만점)가 출력된다.
		 */
		
		Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것
        // TODO: 구현하기
        
        int count = 0;
        for(int i = 0 ; i < 5; i++) {
        	int number = rand.nextInt(20);
        	System.out.println(keyList.get(number) + "의 수도의 이름은 ?");
        	String answer = scan.next();
        	
        	if(capitalMap.containsValue(answer)) {
        		System.out.println("정답");
        		count += 20;
        	}else {
        		System.out.println("땡");
        	}
        }
		
        System.out.println("총점수는  " + count );
	}

}
