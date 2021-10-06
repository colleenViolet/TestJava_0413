package test01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		두개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
//		int[] numbers = {3, 5, 2, 10, 39};
		
		int[] numbers = {3, 5, 2, 10, 39};
		System.out.print("두개의 index를 입력 하세요(0 <= n < 5) : ");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		int moment = 0;
		
		moment = numbers[index1];
		numbers[index2]= numbers[index1];
		numbers[index2]= moment;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤 섞어서 그 결과를 출력 하세요.
//		힌트
//		rand() 함수를 이용해서, 0번째 index의 값과 rand() 번째 index의 값의 서로 교체 하면 된다.
		
		int[] ziffere = {1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
		int temporary =0;
		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
		    int randomNumber = rand.nextInt(10);
		    // swap 구현
		    temporary = ziffere[randomNumber];
		    ziffere[randomNumber] = ziffere[0];
		    ziffere[0]= temporary;
		    
		}
		System.out.println(Arrays.toString(ziffere));
		
//		아래 배열에 1 ~ 9 의 숫자들이 들어는데 하나의 수가 빠져 있다.
//		빠진 수를 찾아서 출력하세요.
		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
		int sum = 0;
		for (int i = 0; i < numbers2.length; i++) {
			sum += numbers2[i];
		}
		
	    System.out.println("없는 수는 "+ (45 - sum) + "입니다.");
	    
//	    1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장 되어 있다.
//	    1 ~ 5 까지의 숫자가 각각 몇 개씩 저장 되어 있는지 출력 하세요.
	    
	    //tip. 배열을 두개 사용해서 생각 하면 가능하다. 
	    int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
	    int[] count = new int[5];
	   
	    	 for(int i = 0; i < numbers3.length; i++) {
	    		   count[numbers3[i]-1]++; // number3[i] 의 값은 count[i]값과 동일 0~9 
	    		  }
	    	 
	    	 for(int i =0; i < count.length; i++) {
	    		   System.out.println((i + 1) + " : " + count[i]); // 카운트 출력을 위한 구문
	    		  }

	    	
		
	    
	    
	}

}
