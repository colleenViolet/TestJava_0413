package test01;

import java.util.Arrays;
import java.util.Random;

public class LottoChecker {
	
	private int[] realLottoNumber = new int [6];
	
// 로또 랜덤으로 숫자를 뽑는 것와 같기 때문에 이하 내용은 생략 한다. 
	Random rand = new Random();
	
	private boolean checkDuplicate (int count) {
		for (int i = 0; i < realLottoNumber.length; i++) {
			if (count == realLottoNumber[i]) {
				return true;
			}
		}
		return false;
	}
	
	public void randomLottoNumber() {
		for (int i = 0; i < 6; i++) {
		    int randomNumber = rand.nextInt(45)+ 1;
		   if(this.checkDuplicate(randomNumber)) {
			   i--;
			   continue;
		   }
		   this.realLottoNumber[i] = randomNumber ;
		}
		System.out.println(Arrays.toString(realLottoNumber));

	}
	
	//위에 뽑힌 숫자와 Lotto클래스의 뽑은 숫자를 비교해서 몇개가 맞는 지 확인한다. 
	public void lottoChecker(Lotto lottoNumber) {
		
		int count = 0;
		for (int i = 0; i < this.realLottoNumber.length; i++) {
			for (int j = i+1; j < realLottoNumber.length; j++) {
				if(realLottoNumber[i] == lottoNumber.getLottoNumber(j)) {
					count++;
				}
			}
		}
		
		if(count == 6) {
			System.out.println("1등");
			
		}else if(count == 5) {
			System.out.println("2등");
			
		}else if (count ==4) {
			System.out.println("3등");
			
		}else if (count == 3) {
			System.out.println("4등");
		}else if (count == 2) {
			System.out.println("5등");
		}else {
			System.out.println("꽝");
		}
		
		
	}
	

}
