package test02;

public class Test02 {
	public static void main(String[] args) {
		
		
		
//		�Ʒ� �迭�� 5���� 10���� ���� ������ ���� �س��� ���̴�.
//		�� �迭�� �̿��ؼ� �Ʒ� ������ Ǯ�� ������
		
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
//		�� �л��� ����� ���� ���ؼ� ��� �ϼ���.
		for (int i = 0; i < scores.length; i++) {
//			int sum = 0;
//			for (int j = 0; j < scores[i].length; j++) {
//				sum += scores[i][j];
//			}
//			System.out.println(sum/(double)scores[i].length);
			double result = getAverage(scores[i]);
			System.out.println("����� " + result);
			
			//�������� ���� �ʰ� �������� �� ģ���� �Լ��� ���� ����Ѵ�. 
			
		}
		
//		�� �л��� �ְ� ������ ���ؼ� ��� �ϼ���.
		
		for (int i = 0; i < scores.length; i++) {
			int max = 0;
			for (int j = 0; j < scores[i].length; j++) {
				if(max < scores[i][j]) {
					max = scores[i][j];
				}
			}
			System.out.println((i + 1) + "��° �л��� �ְ����� " + max);
		}
		
		
		
//		����� ���� ���� �л��� ��������� ���° �л����� ����ϼ���.
//		����� �Ҽ��� ù° �ڸ� ������ ��� �ϼ���.
		 double max = 0;
		 int order= 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			double average = 0;
			
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				average = sum / 10.0;
			}
			if(max < (average)) {
				max = average;
				order = i+1;
			}
		}
		System.out.println("����� ���� ���� �л��� ����� " + max + ", "+ order + "��°�̴�.");
		
//		index 4��° ������ �ְ� ������ �л��� ���° �л����� ��� �ϼ���.
		int[] forthSubjects = new int [5];
		max = 0;
		order =0;
		for (int i = 0; i < scores.length; i++) {
			forthSubjects[i] = scores[i][3];
			if(max < forthSubjects[i]) {
				max = forthSubjects[i];
				order = i + 1;
			}
		}
		System.out.println("4��° ������ �ְ������ڴ� "+ order + "��° �л�");
		System.out.println("���� : " + max);
		
//		������� index 3 ~ 7 �� ����� ���� ���� �л��� index�� ���Ͽ� ����ϼ���.
//		����� �Ҽ��� ù° �ڸ� ������ ��� �ϼ���.
		
		max = 0;
		order = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			double average = 0;
			for (int j = 2; j < 7; j++) {
				sum += scores[i][j];
				average = sum / 10.0;
				
			}
			if(max < average) {
				max = average;
				order = i+1;
			}
		}
		
		System.out.println("����� ���� ���� �л��� ����� " + max + ", "+ order + "��°�̴�.");
		
		
	}
	
	//�л��� ���� �迭�� �޾� ��հ� ���ϱ� 
	public static double getAverage(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		return(sum/(double)scores.length);
		
	}

}