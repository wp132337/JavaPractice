/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	 |_ SmartPhoneTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author	: 허석민
 * @verson	: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {

		SmartPhone[] phone = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(int i=0; i<phone.length; i++) {
			System.out.println(phone[i]);
			phone[i].turnOn();
			phone[i].pay();
			phone[i].useSpecialFunction();
			phone[i].turnOff();
			
			System.out.println();
		}
	}
}
