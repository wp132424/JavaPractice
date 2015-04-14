package org.dimigo.oop;

public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2(String company_t, String model_t, String color_t, int maxSpeed_t, int price_t)
	{
		company= company_t;
		model= model_t;
		color= color_t;
		maxSpeed= maxSpeed_t;
		price=price_t;
	}
		
		public String getCompany(){
			return company;

		}
		public String getmodel(){
			return model;
			}
		public String getColor(){
			return color;
		}
		public int getmaxSpeed(){
			return maxSpeed;
		}
		public int getprice(){
			return price;
	    }
		
		public void setcompany(String company_t)
		{
			company = company_t;
		}
		public void setmodel(String model_t)
		{
			model = model_t;
		}
		public void setcolor(String color_t)
		{
			color = color_t;
		}
		public void setmaxSpeed(int maxSpeed_t)
		{
			maxSpeed = maxSpeed_t;
		}
		public void setprice(int price_t)
		{
			price = price_t;
		}

}

