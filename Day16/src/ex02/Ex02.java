package ex02;

public class Ex02 {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.cry();
		cat.eat();
		
		//구직자 . 회사
		
		Employee me = new Employee();
		Employer_naver naver = new Employer_naver();
		
		naver.recuritJavaProgrammer(me);
		
	}

}
