package test02;

public class Ballpen extends Pen {
	
	private String color;
	
	public Ballpen (int amount, String color) {
		super(amount);
		this.setAmount(amount);
		this.color = color;
	} 
	
	
	public String getColor() { 
        return color; 
    }
    public void setColor(String color) { 
        this.color = color; 
    }
    
    @Override
	public void settingCondition() {
		System.out.println("펜의 갯수는 " + this.getAmount() + "개 있습니다. 색는 " + this.color + "입니다.");
	}

}
