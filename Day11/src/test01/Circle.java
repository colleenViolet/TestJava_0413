package test01;

public class Circle {
	int radius;
	int count;
	double pi = 3.14;
	
	double erea() {
		double erea = radius * radius * pi;
		return erea;
	}
	double round() {
		double round = 2*pi*radius;
		return round;
	}
	
	double countCircleErea() {
		double countCircleErea = (radius * radius * pi)*count ;
		return countCircleErea;
	}

}
