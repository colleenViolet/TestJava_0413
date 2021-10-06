package ex01;

public class Ex01 {
	public static void main(String[] args) {
		//추상 클래스 (추상매소드가 포함되는 클래스)
		//추상클래스는 객체화 할수 없다. 
		// 추상클래스는 상속을 기반으로 사용되는 클래스이다. 
		// 동물, 과일, 채소 등등 추상적인것을 만든다고 생각 하면 된다. 
		// 이 이하 자식 클래스로 구체화 또는 재 정의를 하는 것이다. 
		
		Dog dog = new Dog();
		Animal puppy = new Dog(); 
		
	}

}
