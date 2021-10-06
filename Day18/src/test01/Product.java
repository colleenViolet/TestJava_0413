package test01;

import ex01.Member;

public class Product {
	
	private String name;
	private int price;
	private int count;
	
	public Product(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return"( 제품명: " + this.name +  "  가격  : " + this.price + " 재고 : " + this.count + ")";
	}
	
	

}
