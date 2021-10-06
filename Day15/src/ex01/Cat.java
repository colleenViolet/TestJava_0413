package ex01;

public class Cat extends Animal {
	
	public Cat(String name){
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("¾ß¿Ë");
		
	}
	
	public void grooming() {
		System.out.println("±×·ç¹Ö");
	}

}
