package ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		//이차원 배열
//		int[][] scores = {
//			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
//			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
//			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
//			    {65, 63, 57, 87, 88, 92, 78, 85, 70, 68},
//			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
//			};
		//int[][] scores = new scores[2][3];
		//몇개의 배열의 몇개의 수를 저장할지를 생각 하면 된다. 
		// 큰것에서 작은 것으로 들어간다고 생각 하는 것이 매우 쉬울 것이다.
		
		//예제
		//5명의 학생 3과목 점수 저장
		
		int[][] scores= {
				{90, 65, 85},
				{50 ,99 ,98},
				{56, 85, 100},
				{65, 85, 90},
				{32, 100, 100}
		};
		
		System.out.println("3번째 학생의 두번째 점수" + scores[2][1]);
		System.out.println("2번째 학생의 1번째 점수" + scores[1][0]);
		System.out.println("5번째 학생의 3번째 점수" + scores[4][2]);
		
		//반복문으로 출력
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+ " ");
			}
			System.out.println();
		}
		
		//학생별 평균 구하기
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println(sum/3.0);
		}
		
	}

}
