package org.dimigo.basic;

public class Promotion {
	
	public static void main(String[] args) {
		
		int pay=1700000;
		int empolyee=3;
		int store=1500;
		long LaborCost=(long) pay*12*empolyee*store;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", pay) + "원");
		System.out.println("점포 내 직원 수 : " +  String.format("%,d", empolyee) + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개 " + "\n\n");
		System.out.println("연간 인건비 : " + String.format("%,d", LaborCost) + "원");		
	}
	
}
