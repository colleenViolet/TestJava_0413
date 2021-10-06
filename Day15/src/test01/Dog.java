package test01;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("港港!!");	
	}
	
	public void wagsItsTail() {
		System.out.println("如甸如甸");
	}

}
