package ex02;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//break 예시
		int i = 0;
		while(true) {
			if(i == 5) {
				break;
			}
			System.out.println("Hello World");
			i++;
		}
		
		//continue 예시 : 3의 배수일때 짝을 출력하시오.
//		for(i = 1; i <= 10; i++) {
//			if (i % 3 == 0) {
//				System.out.println("짝");
//			}else {
//				System.out.println(i);
//			}
//		}
		
		for(i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("짝");
				continue;
			}
				System.out.println(i);
		}
		
	}
}
