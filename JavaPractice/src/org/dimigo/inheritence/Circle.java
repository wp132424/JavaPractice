package org.dimigo.inheritence;

public class Circle extends Figure {
	private int radius;
	
	public Circle(int radius) {
		this(0,0,radius);
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return Math.PI * radius * radius;
	}
	
	protected void printCenter() {
		System.out.printf("원 중심좌표 : (%d, %d)\n", super.centerX, super.centerY);
	}
}
