package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int dis = 25;
		String car = "경차";
		int pay = 0;
		int add; //추가요금
		
		if(dis<=10) {
			add=0;
		} else {
			if(dis%10==0) add=(dis/10)-1;
			else add=dis/10;
		}

		switch(car) {
		case "고속버스":
			pay=850+300*add; break;
		case "경차":
			pay=300+200*add; break;
		case "그 외":
			pay=600+200*add; break;
		default:
			System.out.println("정보 오류!");
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리: " + dis + "km");
		System.out.println("차종: " + car);
		System.out.println("통행료: " + pay + "원");

	}
}
