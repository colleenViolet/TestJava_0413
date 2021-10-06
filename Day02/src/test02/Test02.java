package test02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=90;
		int count2=80;
		char grade1= 'A';
	    char grade2='B';
	    double mark1=4.0;
	    double mark2=3.0;
		
		System.out.println("시험성적이"+count1+"점 이상이면\'"+grade1+"\'학점이고 평점은"+mark1+"이다.");
		System.out.println("시험성적이"+count2+"점 이상이면 \'"+grade2+"\'학점이고 평점은"+mark2+"이다.");
		
		int number1 = 33;
		double number2 = 35.325;
		System.out.println("두수의 곱은"+(number1*number2));
		
		int days =943;
		System.out.println("943시간은"+(days/24)+"일"+(days%24)+"시간입니다.");
		
	    int width =8;
	    int height=9;
	    
	    System.out.println("높이 9와 너비 8의 사각형 넓이는"+(width*height));
	    System.out.println("높이 9와 너비 8의 삼각형 넓이는"+(width*height/2));
	    
		int korean =93;
		int math=88;
		int english = 94;
		
		System.out.println("국어 점수는"+korean+" 수학점수는"+math+" 영어점수는"+english);
		System.out.println("세 과목의 평균점수는 "+((korean+math+english)/3.0));
		
		int temper =30;
		System.out.println("섭씨 30도는 화씨"+(9.0/5*temper+32)+"입니다.");
		
	}

}
