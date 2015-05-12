package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author	: 허석민
 * @verson	: 1.0
 */
public class Question {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		
		System.out.println("내 이름은?");
		answer = sc.nextLine();
		if("허석민".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println();
		
		System.out.println("내가 좋아하는 음식은?");
		answer = sc.nextLine();
		if("초밥".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println();
		
		System.out.println("내가 싫어하는 음식은?");
		answer = sc.nextLine();
		if("치즈".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		sc.close();
	}
}
