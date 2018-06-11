package test2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Weacon {
	String w = "서울 비 10 5 80 0.5 남풍"
	        + " 대전 흐림 12 1 60 0.6 서풍"
	      	+ " 대구 맑음 18 0 40 1.2 남서풍"
	        + " 부산 맑음 20 1 30 0.8 남동풍"
	        + " 광주 비 16 20 90 0.1 북풍"
	        + " 강릉 눈 -2 80 60 0.25 동풍"
	        + " 제주 맑음 22 5 60 0.01 남서풍";    //도시 날씨 온도 강수량 습도 미세먼지농도 풍향

	StringTokenizer st = new StringTokenizer(w, " ");
	DetailWeather[] war = new DetailWeather[7];
	Scanner sc = new Scanner(System.in);
	//데이터 입력
	public void input() {
		int i=0;
		while(st.hasMoreElements()) {
			war[i] = new DetailWeather();
			war[i].city = st.nextToken();
			war[i].wea = st.nextToken();
			war[i].tem = st.nextToken();
			war[i].rain = st.nextToken();
			war[i].hum = st.nextToken();
			war[i].dust = st.nextToken();
			war[i].direction = st.nextToken();
			
			i++;
		}
	}
	
	public void search(String city) {
		for(int i=0; i<war.length; i++) {
			if(city.equals(war[i].city)) {
				System.out.println("1. 간단정보, 2. 상세정보");
				
				
				int num = sc.nextInt();
				if(num == 1) {
					war[i].info();
					continue;
				}else {
					war[i].info(num);
				}
			}
				
		}
	}
}
