package test01;

public class Test01 {
	public static void main(String[] args) {
		
		Lotto lottoNumber = new Lotto();
		lottoNumber.randomLottoNumber();
		
		LottoChecker realNumber = new LottoChecker();
		realNumber.randomLottoNumber();
		realNumber.lottoChecker(lottoNumber);
		
		
		
	}

}
