package test01;

public class IPodTouch {
	private String maker;
    private String model;

    public IPodTouch() {
        this.maker = "apple";
        this.model = "iPodTouch";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void internetBrowsing(String url) {
        System.out.println(url + " 로딩중...");
        System.out.println("로딩 완료");
    }

    public void playMusic(String musicName) {
        System.out.println(musicName + " 재생 시작");
    }

    public String infoString() {
    	System.out.println(this.maker + "-" + this.model);
        return this.maker + " - " + this.model;
      
    }

}
