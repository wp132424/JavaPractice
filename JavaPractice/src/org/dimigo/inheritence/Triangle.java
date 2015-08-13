package org.dimigo.inheritence;

public class Triangle extends Figure{
	private int width;
	private int height;
	
	public Triangle (int _width, int _height) {
		super(0,0);
		width= _width;
		height= _height;
	}
	  public Triangle(int _centerX, int _centerY, int _width, int _height) {
	        super(_centerX, _centerY);
	        width = _width;
	        height = _height;
	    }

	    @Override
	    protected double calcArea() {
	        return width*height/2.0;
	    }


}
