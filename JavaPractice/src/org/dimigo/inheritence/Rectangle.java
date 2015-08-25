package org.dimigo.inheritence;

public class Rectangle extends Figure {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width * height;
	}

	protected void printCenter() {
		System.out.printf("사각형 중심좌표 : (%d, %d)\n", super.centerX, super.centerY);
	}
}