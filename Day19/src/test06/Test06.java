package test06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		
		List<Person> personList = new ArrayList<>();
		while (true) {
			
			System.out.println("1 : 입력  2: 출력  3: 삭제   4: 종료");
			int putIn = scan.nextInt();
			
			if(putIn == 4) {
				System.out.println("종료 합니다.");
				break;
			}
			
			switch (putIn) {
				case 1:
					System.out.println("이름과 생년월일을 입력하시오.");
					String name = scan.next();
					int birth = scan.nextInt();
					
					personList.add(new Person(name, birth));
					break;
					
				case 2:
					System.out.println(personList);
					
					break;
					
				case 3:
					System.out.println("삭제할 과일 이름을 쓰시오.");
					String person = scan.next();
					personList.remove(person);
					System.out.println("삭제 성공");
					break;
					
				//	case 4:
				//		System.out.println("종료 합니다. ");
				//		break;
					
				default:
					System.out.println("잘못 입력 하였습니다. ");
					break;
				}
			}
		}
	}


