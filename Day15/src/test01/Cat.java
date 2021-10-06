package test01;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("³É³É!!");	
	}
	
	public void grooming() {
		System.out.println("ÇÓÂ¦ÇÓÂ¦");
	}

}
