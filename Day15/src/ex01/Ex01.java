package ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		Dog dog = new Dog("누렁이");
		Cat cat = new Cat("바다");
		
		cat.cry();
		dog.cry();
		
		cat.eat();
		dog.eat();
		
		dog.fishTail();
		cat.grooming();
		
		//업케스팅
		Animal animal = new Dog("검둥이");
		animal.cry();
		animal.eat();
		
		Animal animal2 = new Cat("바다");
		animal2.cry();
		animal2.eat();
		
		cryAnimal(animal);
		cryAnimal(animal2);
		
		//동물 배열을 만들어서 여러 동물을 저장한다. 
		
		Animal[] animals = new Animal[2];
		animals[0] = dog;
		animals[1] = cat;
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].cry();
			animals[i].eat();
			
			//강아지 꼬리치기 
			// 다운케스팅
			if (animals[i] instanceof Dog) {
				
				Dog nu = (Dog) animals[i];
				nu.fishTail();
			}
			
			//고양이 그루밍
			if (animals[i] instanceof Cat) {
				Cat sea = (Cat) animals[i];
				sea.grooming();
				
			}
			
			
		
		}
		
		
		
	}
	//파라미터로 받은 동물을 울게 한다. 
	
	public static void cryAnimal(Animal animal) {
		animal.cry();
	}
	
}
