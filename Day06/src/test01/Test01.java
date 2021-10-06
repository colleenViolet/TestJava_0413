package test01;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
//		두개의 주사위를 굴렸을때, 나올 수 있는 모든 경우의 수를 출력 하세요.
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j < 7; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
		System.out.println();
		}
		
//		구구단을 2단에서 부터 9단 까지 모두 출력하세요.
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println( i + "X" + j +" = " + (i * j));
			}
		}
		
		System.out.println();
		
//		아래 형태처럼 *을 출력하세요
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		아래 형태처럼 *을 출력하세요
//		*****
//		****
//		***
//		**
//		*
		
		for(int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		
//			*
//		   **
//		  ***
//		 ****
//		*****
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
//		
//		 	*
//		   ***
//		  *****
//		 *******
//		*********
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2*i)+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		
	}

}
