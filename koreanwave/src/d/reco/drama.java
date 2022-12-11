package d.reco;

import java.util.Scanner;

//열거타입을 이용한 제목출력
enum Conform{
			hallyu}

public class drama {
	//필드
	String name;

	void start(){
	//열거타입을 이용한 제목출력
	Conform title=null;
	title=Conform.hallyu;
	System.out.println(title);
	System.out.println("");
	
	System.out.println("~~~~It's a K-drama recommendation program. Welcome!~~~~");
	System.out.println("What genre are you curious about? (Enter a number.)");
		//System.out.println("What genre are you curious about? (Enter a number.)");
		
		/*배열을 이용한 선택지 출력&입력 new연산자 사용?210*/
		String[] genre= {"1.romance","2.fantasy","3.historical","4.action","5.ect.","6.Shutting down a Program"};
		for (int i=0;i<6; i++){
			System.out.println(genre[i]);}
	
	}
}
