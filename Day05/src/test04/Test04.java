package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
//		�ݺ����� �̿��ؼ� A~Z ���� ����ϼ���
//		for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++ ) {
//			System.out.print(alphabet + " ");
//		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print((char)(65+i) + " ");
		}
		System.out.println();
		
		
		Scanner scan = new Scanner(System.in);
		
//		���� �Է� �޾Ƽ� 1���� ���� �� �� ������ ���� ����ϼ���.
//		��, ���� 100�� ������ ���� �ߴ��ϰ� �׶� ������ ���� ����ϼ���.
		System.out.print("���� �Է��Ͻÿ�: ");
		int number = scan.nextInt();
		int sum = 0;
		for(int i = 0; i <= number; i++) {
			if(sum >= 100) {
				System.out.println(sum);
				break;
			}
			sum += i;
		}
		
//		1 4 7 10 13 16 19 22 25 ... ��
//		1���� ������ ������ ���� ���� 3�� ���� ���� ���� ���� �����̴�.
//		�̷��� ���� ���п����� �յ� ������ ���̰� ���ٰ� �Ͽ�
//		����(���̰� ������ �ѹ� ��) �����̶�� �Ѵ�.
		
		System.out.println("������ ���� �Է��Ͻÿ�. : ");
		int start = scan.nextInt();
		int term = scan.nextInt();
		int number1 = scan.nextInt();
		
		sum = start;
		for (int i = 0; i < number1; i++ ) {
			sum += term;	
		}
		System.out.println(sum);
		System.out.println();
		
//		4. �Ҽ�(prime) �Ǻ�
//		�Ҽ�: 1�� �ڱ��ڽ� �̿ܿ� ������ �������� �ʴ� ���̴�.
//
//		���� �Է� �ް� �� ���� �Ҽ�(prime)���� �ƴ��� ����ϼ���.
		System.out.println("���� �Է��Ͻÿ�: ");
	    int prime = scan.nextInt();
	   
	    //�÷��� ��� (���� ����ؼ� ����ϴ� ���)
//	    boolean isPrimeNumber =true;
//	    for(int i = 2; i < prime ; i++) {
//	    	if(prime % i == 0) {
//	    		System.out.println("�Ҽ��� �ƴմϴ�.");
//	    		isPrimeNumber = false;
//	    		break;
//	    	}
//	    }
//		
//	    if(isPrimeNumber) {
//	    	System.out.println("�Ҽ��̴�.");
//	    }
		
	    //i Ȱ���ϱ�
		int i; 
		for(i = 2; i < Math.sqrt(prime); i++) {
			if(prime % i == 0) {
	    		System.out.println("�Ҽ��� �ƴմϴ�.");
//	    		isPrimeNumber = false;
	    		break;
	    	}
		}
		if (i == number) {
			System.out.println("�Ҽ��̴�.");
		}
	}

}