package test01;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
//	로또 번호를 수동으로 받아서 저장한다.
//	로또 번호를 자동으로 생성해서 저장 한다
	 
	//번호
	private int[] lottoNumber ;
	
	public Lotto() {
		lottoNumber = new int[6];
	}
	
	//수동
	public void manual(int number1, int number2, int number3, int number4, int number5, int number6 ) {
		lottoNumber[0] = number1;
		lottoNumber[1] = number2;
		lottoNumber[2] = number3;
		lottoNumber[3] = number4;
		lottoNumber[4] = number5;
		lottoNumber[5] = number6;
	}
	
	//자동
	public int getLottoNumber(int number) {
		return lottoNumber[number];
	} 
	
	Random rand = new Random();
	//특정 숫자가 다른 숫자와 중복 여부 판별
	private boolean checkDuplicate (int number) {
		for (int i = 0; i < lottoNumber.length; i++) {
			if (number == lottoNumber[i]) {
				return true;
			}
		}
		return false;
	}
	// 랜덤 자동으로 숫자를 뽑아 낸다. 
	public void randomLottoNumber() {
		for (int i = 0; i < 6; i++) {
		    int randomNumber = rand.nextInt(45)+ 1;
		   if(this.checkDuplicate(randomNumber)) {
			   i--;
			   continue;
		   }
		   this.lottoNumber[i] = randomNumber ;
		}
		System.out.println(Arrays.toString(lottoNumber));

	}
	
}
