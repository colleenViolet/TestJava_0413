package test04;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		index 와 값을 차례로 입력 받아서, 아래 배열에 해당하는 index에 값을 바꾸고 출력 하세요.
		int[] numbers = {3, 5, 2, 10, 39};
		System.out.print("변경한 index와 값을 입력하세요 : ");
		int order = scan.nextInt();
		int number = scan.nextInt();
		
		numbers[order]= number;
		for (int i = 0; i < numbers.length; i++ ) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		//아래와 같이 O 와 X로 채점 결과가 저장된 배열이 있다.
//		100점 만점 기준으로 몇점을 맞았는지 출력하세요.
		char[] scores = {'X','O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		
		int count = 100;
		for(int i = 0; i < scores.length; i++) {
			if (scores[i] == 'X') {
				count -= 10;
			}
		}
		
		System.out.println("채점결과는 " + count + "점 입니다.");
		
//		아래 배열은 각각 월, 화, 수, 목, 금, 토, 일 7일간의 아르바이트를 한 시간을 나타낸다.
//		시급 기준이 아래와 같을때 7일 동안 일한 총 임금의 값을 출력하세요.
		
//		평일 시급 : 8500원
//		주말(토,일) 시급 : 9500원
		
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		
		int pay = 0;
		int pay1 = 0; 
		int sum = 0;
		for(int i = 0; i < works.length-2; i++) {
			 pay = works[i] * 8500;
			 sum += pay;	
		}
		
		for(int i = works.length-1; i > works.length -3; i--) {
			pay1 = works[i] * 9500;
			sum += pay1;
		}
		
		System.out.println("일주일간  총 임금은 " + sum + " 원 입니다. ");
		
		
//		반복문을 이용해서 A~Z 를 배열에 저장해서 출력 하고, 'V' 가 몇번째 알파벳인지 출력 하세요.
		char[] alphabets= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for (int i = 0; i < alphabets.length; i++) {
			if (alphabets[i] == 'V') {
				System.out.println("v는 " + (i + 1) + "번째 입니다.");
				break;
			}
		}
		
//		길이가 5인 int 배열을 만든다.
//		수를 무한 루프로 입력 받으면서, 입력 받은 수가 짝수 일때만, 배열에 저장한다.
//		배열이 가득차면 입력을 중단하고, 저장된 수들을 출력한다.
		
		int[] numbers1 = new int[5];
		int i = 0; 
		
		while(true) {
			if(i >= numbers1.length) {
				break;
			}
			System.out.print("수를 입력하시오 : ");
			int number1 = scan.nextInt();
				if(number1 % 2 == 0) {
					numbers1[i] = number1;
					i++;
				}
		}
		
		System.out.println(Arrays.toString(numbers1));
	
		
		}

	}
	


