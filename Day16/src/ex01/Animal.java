package ex01;

public abstract class Animal {
	
	private String name;
	
	public void eat() {
		System.out.println("냠냠");
	}
	
	public abstract void cry(); 
	
	//막쓸수 없게 만들수 있다. 사용 용도에 따라서 다르다. 
	
}
