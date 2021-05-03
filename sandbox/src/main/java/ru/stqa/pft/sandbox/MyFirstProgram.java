package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    // System.out.println("Hello, World!");

    Point p = new Point(4, 8, 7, 6);

    System.out.println("Расстояние между точкой с координатами (" + p.x1 + "; " + p.y1 + ") и точкой с координатами (" + p.x2 + "; " + p.y2 + ") равно: " + p.distance());

  }

}