package test05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> fruitsList = new ArrayList<>(); 
		
		while (true) {
			
			
			System.out.println("1 : 입력  2: 출력  3: 삭제   4: 종료");
			int putIn = scan.nextInt();
			
			if(putIn == 4) {
				System.out.println("종료 합니다.");
				break;
			}
			
			switch (putIn) {
			case 1:
				System.out.println("과일을  입력 하시오");
				String name = scan.next();
				fruitsList.add(name);
				break;
				
			case 2:
				System.out.println(fruitsList);

				break;
				
			case 3:
				System.out.println("삭제할 과일 이름을 쓰시오.");
				String fruit = scan.next();
				fruitsList.remove(fruit);
				System.out.println("삭제 성공");
				break;
				
//			case 4:
//				System.out.println("종료 합니다. ");
//				break;

			default:
				System.out.println("잘못 입력 하였습니다. ");
				break;
			}
		}
		
	}

}
