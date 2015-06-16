package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ FamilyMember
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 *
 * @author	: 허석민
 * @verson	: 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName) { 
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMember() {
		return memberName;
	}
	
	public static void printMember() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}

}
