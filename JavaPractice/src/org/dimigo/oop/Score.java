package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ Score
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 *
 * @author	: 허석민
 * @verson	: 1.0
 */
public class Score {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 => ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		int mat = sc.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		int eng = sc.nextInt();
		
		System.out.println();
		
		String sb = new StringBuilder()
		  .append("<< 점수 출력 >>\n")
		  .append("국어 점수:").append(kor).append("점\n")
		  .append("수학 점수:").append(mat).append("점\n")
		  .append("영어 점수:").append(eng).append("점\n")
		  .append("총점:").append(kor+mat+eng).append("점\n")
		  .append("평균:").append(String.format("%.1f",(kor+mat+eng)/3.0)).append("점\n").toString();
		
		System.out.println(sb);
		
		sc.close();
	}
	
}