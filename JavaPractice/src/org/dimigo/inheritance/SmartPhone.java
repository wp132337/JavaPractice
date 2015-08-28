/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	 |_ SmartPhone
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author	: 허석민
 * @verson	: 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}

	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay() {
		
	}
	
	public void useSpecialFunction() {
		if( this instanceof IPhone) {
			IPhone i = (IPhone)this;
			i.useAirDrop();
		} else if( this instanceof Galaxy) {
			Galaxy g = (Galaxy)this;
			g.useWirelessCharging();
		} else {
			System.out.println("기능 없음");
		}
	}
	
	public String toString() {
		return "모델명 : " + model +  ", 제조자 : " + company + ", 가격 : " + String.format("%,d", price) + "원";
	}
	
}
