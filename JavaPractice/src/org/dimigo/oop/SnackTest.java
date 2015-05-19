package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ SnackTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 *
 * @author	: 허석민
 * @verson	: 1.0
 */
public class SnackTest {
	
	public static void main(String[] args) {
		Snack[] snackArr = new Snack[] {
				new Snack("새우깡","농심",1100,2),
				new Snack("콘칠","크라운",1200,1),
				new Snack("허니버터칩","해태",1500,4)
		};
		
		int sum=0;
		for(Snack value: snackArr) {
			value.printSnack();
			sum += value.calcPrice();
		}
		
		System.out.println("총 구매 금액 :" + String.format("%,d", sum) + "원");
	}

}
