package test04;

public class Omrcard {
//	OmrCard 클래스
//	＊객관식 문제의 정답은 1~5까지이다.
//	＊문제 개수는 총 5개이다.
//	＊학번과 이름을 입력 받는다.
//	＊순서대로 정답을 입력받는 메소드를 만든다.
	
	private String name ; 
	private String studentId;
	private int[] answer = new int [5];
	
	public Omrcard(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	public String getName() {
		return "이름 : " + name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getStudentId() {
		return "학번 : " + studentId;
	}
//	public void setStudentId(String studentId) {
//		this.studentId = studentId;
//	}
	public void setAnswer(int[] answer) {
		this.answer = answer;
	}
//	
//	public int[] getAnswer() {
//		return  this.answer;
//	}
	
	public int getAnswer (int number) {
		return this.answer[number] ;
				
		}

	public void setAnswer(int number, int answer) {
		if(number < 0 || number > 5) {
			System.out.println("문제의 범위에 맞지 않습니다. ");
			return;
		}
		if(answer < 1 || answer > 5) {
			System.out.println("정답의 범위에 맞지 않습니다. ");
			return;
		}
		this.answer[number] = answer;
		
	}
	
	

}
