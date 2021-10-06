package test02;

public class SharpPencil extends Pen {//»þÇÁÆæ½½
	
	private double width; //Ææ±½±â
	
	public SharpPencil (int amount, double width) {
		super(amount);
		this.setAmount(amount);
		this.width = width;
	}
	
	
	@Override
	public void settingCondition() {
		System.out.println("ÆæÀÇ °¹¼ö´Â " + this.getAmount() + "°³ ÀÖ½À´Ï´Ù. µÎ²²´Â " + this.width + "ÀÔ´Ï´Ù.");
	}

}
