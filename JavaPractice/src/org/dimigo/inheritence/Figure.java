package org.dimigo.inheritence;

public class Figure {
	
	private int centerX;
	private int centerY;
	
	public Figure(int _centerX, int _centerY) {
		this.centerX= _centerX;
		this.centerY= _centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}

}
