package test02;

public abstract class Test02 {

	public static void main(String[] args) {
		
//		35 ~ 40 까지 출력 하세요
		int number = 35;
		for(int i = 0; i < 6; i++) {
			System.out.print(number + i + " ");
		}
//		5 ~ -5 까지 출력하세요
		number = 5;
		for(int i = 0; i < 11; i++) {
			System.out.println(number - i);
		}
		
//		1 ~ 50 사이에 3의 배수만 출력하세요.
		for(int i = 0; i < 51; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		
		
 		

	}

}
