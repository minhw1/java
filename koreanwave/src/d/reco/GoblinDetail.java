package d.reco;
//자식클래스 사용

import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;
import java.io.Writer;

public class GoblinDetail {
	public static void main(String[] args) throws Exception {
		//goblin 객체 생성
		Goblin goblin = new Goblin("Goblin",2016,"plot"," Netflix and Tving");
		
		//인터페이스 객체 생성
		Poly poly=new Poly();
		King king=new King();
		Squid squid=new Squid();
		
		//컬렉션프레임워크를 이용한
		List<String> list=new ArrayList<String>();
		list.add("BigMouse");
		list.add("Vincenzo");
		list.add("Woo Young-woo, a strange lawyer");
	
		//drama 클래스로부터 상속받은 메소드 호출
		goblin.start();
		
		/*각 장르에 속하는 드라마 출력*/
		Scanner findgenre = new Scanner(System.in);
		String inputData;
		while(true) {
			inputData=findgenre.nextLine();
			
			//예외처리
			if(inputData.equals("1")) {
				try {
					Class clazz=Class.forName("java.rommance");
				}
				catch(ClassNotFoundException e) {
				System.out.println("I don't have any drama to recommend.\r\n"
						+ "Please choose again.");
				continue;
				}	
			}
			
			//클래스상속을 이용한 출력
			if(inputData.equals("2")) {
				System.out.println("");
				System.out.println("you choose Goblin");
				System.out.println("");
				
				//drama 클래스로부터 상속받은 필드
				System.out.println("Drama name:"+goblin.name);
				
				//goblin 클래스의 필드
				System.out.println("Broadcast year:"+goblin.year);
				
				//goblin 클래스의 메소드호출
				goblin.detailPlot("The angel of death who started a strange cohabitation with a goblin who needed a human bride to end his immortal life. A mysterious romantic story that takes place when a girl of fate that should have died appears in front of them");
				goblin.detailOtt("Netflix and Tving");
				
				continue;
			}
			
			//인터페이스의 다형성
			if(inputData.equals("3")) {
				poly.polym(king);
				continue;
			}
			
			//인터페이스의 다형성
			if(inputData.equals("4")) {
				poly.polym(squid);
				continue;
			}
			
			//컬렉션프레임워크를 이용한 출력
			if(inputData.equals("5")) {
				for(int i=0; i<list.size();i++) {
					String str=list.get(i);
					System.out.println(i+":"+str);
				}
				continue;
			}
			
			//파일입출력을 이용한 문자열출력하기
			if(inputData.equals("6")) {
				System.out.println("Exit the program.");
				Writer writer=new FileWriter("C:\\Users\\user\\Desktop\\java\\unijava\\koreanwave.txt");
				String str="Exit the program.";
				writer.write(str);
				writer.flush();
				writer.close();
				break;
			}
			
			//범위를 초과할 경우
			else{
				System.out.println("Please choose again");
				continue;
			}
		}
		
	}
}
