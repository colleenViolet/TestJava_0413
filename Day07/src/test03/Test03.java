package test03;

public class Test03 {

	public static void main(String[] args) {
//		아래 배열을 이용해서 문제를 푸세요.
//		배열의 시작은 0 인것을 유의 하세요
		
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		numbers[3]= 6;
		
//		배열에 값을 순서로 출력하세요.
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
//		배열에 값이 반대 순서(역순)로 출력하세요.
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		배열에 짝수번째 위치에 있는 값들을 출력 하세요.
//		for(int i = 0; i < numbers.length; i++) {
//			if(i % 2 == 1) {
//				System.out.print(numbers[i] + " ");
//			}
//		}
		
		// 최적화 된 상태 
		for(int i = 1; i < numbers.length; i+=2) {
				System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
//		배열에 값중 2가 들어 있는 index를 출력하세요.
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 2) {
				System.out.println("2가 들어가 있는 index : " + i);
				//뒤의 반복을 할 필요가 없기 때문에 break를 해주는 것이 가장 좋다. 
				break;
			}
		}
		
//		배열에 값중 가장 큰값을 출력 하세요
		int max = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("최대값은 " + max);
		
//		배열에 값중 가장 작은수가 저장된 index를 출력하세요.
		// 최적화 한 풀이 [가능한대로 줄이는 게 가장 좋다.]
		
		int information = 0;
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[information] > numbers[i]) {
				numbers[information] = numbers[i];
				information= i;	
			}
		}
		
//		int min = numbers[0];
//		int information = 0;
//		for(int i = 1; i < numbers.length; i++) {
//			if(min > numbers[i]) {
//				min = numbers[i];
//				information= i;	
//			}
//		}
		
		
		System.out.println("가장작은 수의 index는 " + information + "입니다.");
		
		
//		배열에 모든 수의 합을 출력 하세요
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("값의 합은 " + sum);

	}

}
