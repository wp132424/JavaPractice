package org.dimigo.inheritence;

public class Figure {
	protected int centerX;
	protected int centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}

	protected void printCenter() {
		System.out.printf("중심좌표 : (%d, %d)\n", centerX, centerY);
	}
	
	protected void moveCenter(int x, int y) {
		centerX = x;
		centerY = y;
	}
}