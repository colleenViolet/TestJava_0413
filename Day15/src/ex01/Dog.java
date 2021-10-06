package ex01;

public class Dog extends Animal{
	
	public Dog(String name){
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("港港");
		
	}
	
	public void fishTail() {
		System.out.println("何厚何厚");
	}
}
