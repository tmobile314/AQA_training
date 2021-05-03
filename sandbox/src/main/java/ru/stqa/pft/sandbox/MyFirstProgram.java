package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    // System.out.println("Hello, World!");
    Point p1 = new Point(7, 9);
    //p1.x = 5;
    //p1.y = 1;

    Point p2 = new Point(10, 5);
    //p2.x = 1;
    //p2.y = 4;

    System.out.println("Расстояние между точкой с координатами (" + p1.x + "; " + p1.y + ") и точкой с координатами (" + p2.x + "; " + p2.y + ") равно: " + distance(p1, p2));

  }
    public static double distance(Point p1, Point p2){
      double a = p1.x - p2.x;
      double b = p1.y - p2.y;
      double c = a * a + b * b;

      return Math.sqrt(c) ;
    }


}