package test01;

import ex01.Cat;
import ex01.Dog;

public class Test01 {
	public static void main(String[] args) {
//		아래와 같은 특성을 가지는 개와 고양이 Class 를 설계 하세요.
//		개는 먹이를 "냠냠" 하고 먹고, "멍멍" 하고 울며, "꼬리 흔들흔들" 꼬리 흔들기를 합니다.
//		고양이는 먹이를 "냠냠" 하고 먹고, "야옹" 하며 울며, "핥짝핥짝" 그루밍을 합니다.
//		단, Animal 이라는 Class 를 부모로 갖도록 Animal Class 와 각각 Class 를 설계 하세요.
//		Animal 배열에 객체를 담아서 업캐스팅, 다운캐스팅을 사용해서 아래와 같이 출력 하세요.
		
		 Animal[] animals = new Animal[2];
		 animals[0] = new test01.Cat("나비");
		 animals[1] = new test01.Dog("흰둥이");
		   
		   for (int i = 0; i < animals.length; i++) {
			animals[i].cry();
			animals[i].eat();
			
			//강아지 꼬리치기 
			// 다운케스팅
			if (animals[i] instanceof test01.Dog) {
				test01.Dog white = (test01.Dog)animals[i];				
				white.wagsItsTail();
			}
			
			//고양이 그루밍
			if (animals[i] instanceof test01.Cat) {
				test01.Cat butterfly = (test01.Cat) animals[i];
				butterfly.grooming();
			
				
			}
		}
		 

		
		
	}
}
