package org.dimigo.inheritence;

public class Circle extends Figure {
	private int radius;
	
	public Circle(int _radius) {
		super(0,0);
		radius = _radius;
	}
	
	 public Circle(int centerX, int centerY, int _radius) { 
	         super(centerX, centerY); 
             radius = _radius;           
	 }
	 @Override
	 protected double calcArea() {
	 return radius*radius*Math.PI;
	    }
}
