package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    // System.out.println("Hello, World!");

   /* Point p = new Point(4, 8, 7, 6);

    System.out.println("Расстояние между точкой с координатами (" + p.x1 + "; " + p.y1 + ") и точкой с координатами (" + p.x2 + "; " + p.y2 + ") равно: " + p.distance());

    */
    Square s = new Square(5);
    //s.l = 5;
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    //r.a = 4;
    //r.b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

  }
/*
    public static double area(Square s){
      return s.l * s.l;
    }

    public static double area(Rectangle r){
      return r.a * r.b;
    } */


}