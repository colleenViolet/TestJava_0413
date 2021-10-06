package test01;

public class Goods {
	
	private String goodsName;
	private int price;
	private String goodsCondition;
	
	public Goods(String goodsName, int price, String goodsCondition) {
		this.goodsName = goodsName;
		this.price = price;
		this.goodsCondition = goodsCondition;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public int getPrice() {
		return price;
	}

	public String getGoodsCondition() {
		return goodsCondition;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setGoodsCondition(String goodsCondition) {
		this.goodsCondition = goodsCondition;
	}
	
	
}
