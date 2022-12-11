package d.reco;
//자식클래스
public class Goblin extends drama {
	//필드
	int year;
	String plot;
	String ott;
	
	//생성자
	Goblin(String name, int year, String plot, String ott){
	this.name=name;
	this.year=year;
	this.plot=plot;
	this.ott=ott;//티빙 넷플릭스 따로 클래스?
	}
	
	//메소드
	void detailPlot(String plot) {
		this.plot=plot;
		System.out.println("Plot:"+plot);
	}
	void detailOtt(String ott) {
		this.ott=ott;
		System.out.println("Ott service to view:"+ott);
	}
}
