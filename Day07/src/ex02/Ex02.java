package ex02;

public class Ex02 {

	public static void main(String[] args) {

		// 배열 Array 
		//변수를 여러개 저장해야 하는 경우 많이 사용한다. 
		// 선언과 동시에 초기화 하는 방법과 공간을 먼저 확보하는 방법이 있다. 
//		int[] scores = {89, 93, 91, 93, 92, 78, 90, 90, 93, 90};
//		int[] numbers = new int[10];
//		scores[i]의 형태로 배열에 있는 숫자에 접근이 가능하다.(배열의 순서는 단, 0 부터 시작한다.)
		
		int[] scores = {100, 99 ,98 ,97 ,96, 95};
		int[] numbers = new int[5];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 값은 " + scores[i]);
		}
		
		System.out.println();
//		배열 값 평균 구하기
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("평균은 " + sum/(double)scores.length);
		
		//최고점 구하기
		int max = scores[0];
		for(int i =0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("최대값은 "+ max);

		
	}

}
