package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a= 9;
		int b= 10;
		double h1= 5.8;
		double h2= 5.4;
		double c=  ((a+b)*h1/2)-a*h2;
		
		System.out.println("<<<도형 넓이 비교>>>");
		System.out.println("사다리꼴의 넓이" + (a+b)*h1/2);
		System.out.println("평행사변형 넓이" +a*h2);
		
		System.out.println("사다리꼴이 평행사변형 보다" +c +"더 큽니다");

	}

}
