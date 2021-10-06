package ex01;

public class Ex01 {
	public static void main(String[] args) {
		//Inheritance 상속 
		// protected 로 상속을 할 수 있다. 
		//Override(재정의 )
		
		//예제 (상속에 대하여 생각 해보자)
		
		StudentInformation lee = new StudentInformation("lee do-dyeong", "19980219", "Dima");
		//상속을 하면 부모 클라스에 있는 매소드를 사용 할수 있다. 
		lee.greeting();
		
		PersonInformation I = new PersonInformation("이도경", "19980219");
		//자식 클래스만 부모 클래스를 인식 한다. 일방적인 방향으로 인포를 주고 받는 다고 생각 하는 것이 더 편하다. 
		
	}

}
