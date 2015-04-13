package org.dimigo.oop;

public class CarTest {

   public static void main(String[] args) {
      
      System.out.println("<<<자동차 목록>>>");
      
      Car car1 = new Car();
      Car car2 = new Car();
      Car car3 = new Car();
      
      car1.setcompany("제조사명 :" +"현대자동차");
      car1.setmodel("제네시스");
      car1.setcolor("검정색");
      car1.setmaxSpeed(225);
      car1.setprice(50000000);
      
      System.out.println(car1.getCompany());
      System.out.println(car1.getmodel());
      System.out.println(car1.getColor());
      System.out.println(car1.getmaxSpeed() + "km");
      System.out.println(String.format("%,d" ,car1.getprice()) + "원");
      System.out.println();
      
      car2.setcompany("제조사명 : "+"기아자동차");
      car2.setmodel("K7");
      car2.setcolor("흰색");
      car2.setmaxSpeed(246);
      car2.setprice(40000000);
      
      System.out.println(car2.getCompany());
      System.out.println(car2.getmodel());
      System.out.println(car2.getColor());
      System.out.println(car2.getmaxSpeed() + "km");
      System.out.println(String.format("%,d" ,car2.getprice()) + "원");
      System.out.println();

      car3.setcompany("제조사명 :" +"삼성자동차");
      car3.setmodel("SM7");
      car3.setcolor("회색");
      car3.setmaxSpeed(200);
      car3.setprice(50000000);
      
      System.out.println(car3.getCompany());
      System.out.println(car3.getmodel());
      System.out.println(car3.getColor());
      System.out.println(car3.getmaxSpeed() +"km");
      System.out.println(String.format("%,d" ,car3.getprice()) + "원");
   }

}