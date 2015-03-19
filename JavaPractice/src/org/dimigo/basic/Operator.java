package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a1=9, b1=10, a2=9;
		double h1=5.8, h2=5.4;
		
		double trapezoid = (a1+b1)*h1/2;
		double parallelogram = a2*h2;
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이:" + trapezoid);
		System.out.println("평생사변형 넓이:" + parallelogram + "\n\n");
		
		if(trapezoid > parallelogram) {
			System.out.println("사다리꼴이 평행사변형 보다 " + (trapezoid-parallelogram) + "더 큽니다.");
		} else if(trapezoid < parallelogram) {
			System.out.println("평행사변형이 사다리꼴 보다 " + (parallelogram-trapezoid) + "더 큽니다.");
		} else {
			System.out.println("같습니다.");
		}
		
	}

}
