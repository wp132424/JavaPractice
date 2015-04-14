package org.dimigo.oop;

public class CarTest3 {

   public static void main(String[] args) {
      
      System.out.println("<<<자동차 목록>>>");
      
      Car3 car1 = new Car3("현대자동차","제네시스","검정색",225,50000000);
      Car3 car2 = new Car3("기아자동차","K7","흰색",246);
      Car3 car3 = new Car3("삼성자동차","SM7","회색");
      
         
      System.out.println(car1.getCompany());
      System.out.println(car1.getmodel());
      System.out.println(car1.getColor());
      System.out.println(car1.getmaxSpeed() + "km");
      System.out.println(String.format("%,d" ,car1.getprice()) + "원");
      System.out.println();
      
      System.out.println(car2.getCompany());
      System.out.println(car2.getmodel());
      System.out.println(car2.getColor());
      System.out.println(car2.getmaxSpeed() + "km");
      System.out.println(String.format("%,d" ,car2.getprice()) + "원");
      System.out.println();


      System.out.println(car3.getCompany());
      System.out.println(car3.getmodel());
      System.out.println(car3.getColor());
      System.out.println(car3.getmaxSpeed() +"km");
      System.out.println(String.format("%,d" ,car3.getprice()) + "원");
   }

}