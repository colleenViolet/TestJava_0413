package test04;

import ex02.PersonInfor;

public class Triangle {
	
	private int height;
	private int width;
	
	
	public Triangle (int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public double calculateErea() {
		double erea = (height * width)/2.0;
		return erea;
	}
	
	@Override
	public String toString() {
		String result = this.width +" 에 " + this.height +" 인 삼각형의 넓이는 " + this.calculateErea();
		return result;
	}
	
	public boolean equals(Object obj) {
		Triangle triAngle = (Triangle)obj;
		//각자 다른 삼각형 인식
		
		if(this.calculateErea() == triAngle.calculateErea()) {
			return true;
		}
		return false;
	}
}
