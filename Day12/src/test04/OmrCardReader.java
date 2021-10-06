package test04;

public class OmrCardReader {
//	OmrCardReader 클래스
//	＊객체 생성 시 정답 5개를 입력받아 정답 배열에 저장해둔다.
//	＊OmrCard 객체를 받아서 정답 배열과 OmrCard 카드 객체의 정답과 비교하여, 점수를 출력하세요 (100점 만점)
	
	private String subjectName;
	private int[] answer = new int[5];
	
	//getter
	
	
	//setter
	public void subjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public void setAnswer(int[] answer) {
		this.answer = answer;
	}
	
	//채점 기능
	
	public int scoring(Omrcard omrcard) {
		int score = 100;
		for (int i = 0; i < this.answer.length; i++) {
			if(this.answer[i] != omrcard.getAnswer(i)) {
				score -= 20;
			}
		}
		return score;
		
	}
	
	
	
}
