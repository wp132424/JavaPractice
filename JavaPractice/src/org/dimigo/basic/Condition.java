package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int distance =10;
		String model= "경차";
		int pay;
		int A=(distance/10);
		
		
		
		switch(model) {
		case "경차":
			pay=300;
			break;
		case "고속버스":
			pay=850;
			break;
		default:
			pay =600;
			break;
			
		}
		
		pay = pay*A;
		
		System.out.println("<<<고속도로 통행료 계산>>>");
		System.out.println("거리: " +distance +"km");
		System.out.println("차종:" +model);
		System.out.println("통행료" +pay +"원");

	}

}
