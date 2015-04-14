package org.dimigo.oop;

public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(String company, String model, String color, int maxSpeed, int price)
	{
		this.company= company;
		this.model= model;
		this.color= color;
		this.maxSpeed= maxSpeed;
		this.price=price;
	}
	
	public Car3(String company, String model, String color, int maxSpeed)
	{
		this(company,model,color,maxSpeed,0);
	}
		
	public Car3(String company, String model, String color)
	{
		this(company,model,color,0);
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

