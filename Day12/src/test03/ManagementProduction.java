package test03;

public class ManagementProduction {
//	제품 관리 Class를 설계 하세요.
//	학원에서 학생 관리를 위한 학생 Class 를 설계하세요.
//	생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//	제품 관리 Class 를 통해서 아래 내용을 출력 하세요.
//	유통기한을 이 지나지 않았을 경우 "판매 가능상품", 유통기한이 지났을 경우 "판매 불가 상품"
	
	private String name;
	private int price;
	private String expirationDate;
	
	public ManagementProduction(String name, int price, String expirationDate) {
		this.name = name;
		this.price = price;
		this.expirationDate =expirationDate;
	}
	
	public int getPrice(int count) {
		int getPrice = count * this.price;
		return getPrice;
	}
	
		//유통기한 체크
		//2021-05-11
	boolean availableSale(String date) {
		String[] limitDates = this.expirationDate.split("-");
		String[] todayDates = date.split("-");
		
		int limitYear = Integer.parseInt(limitDates[0]);
		int limitMonth = Integer.parseInt(limitDates[1]);
		int limitDay = Integer.parseInt(limitDates[2]);
		
		int todayYear = Integer.parseInt(todayDates[0]);
		int todayMonth = Integer.parseInt(todayDates[1]);
		int todayDay = Integer.parseInt(todayDates[2]);
		
		if(limitYear > todayYear) {
			return true;
		}else if (limitYear == todayYear) {
			if(limitMonth > todayMonth) {
				return true;
			}else if (limitMonth == todayMonth) {
				if(limitDay > todayDay) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	


	
}
