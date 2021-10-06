package ex03;

public class Ex03 {

	public static void main(String[] args) {
		
// 중첩 반복문 예시
		//벤치프레스 30회씩 3번 반복
//		for(int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 30; j++) {
//				System.out.println("으쌰으쌰");
//			}
//		}
		
		for(int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 30; j++) {
				System.out.println(i + "세트 "+ j + "개째");
			}
		}
// 0-9까지 5번 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		// 00 01 02 03 04 05...
		// 10 11 12 13 14 15 ..
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i +""+ j + " ");
			}
		System.out.println();
		}
		
		//***** x 5줄 표현 
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
	}

}
