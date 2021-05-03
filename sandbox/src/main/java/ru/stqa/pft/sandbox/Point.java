package ru.stqa.pft.sandbox;

public class Point {
  public double x1, x2;
  public double y1, y2;

  public Point(double x1, double y1, double x2, double y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public double distance(){
    double a = this.x1 - this.x2;
    double b = this.y1 - this.y2;
    double c = a * a + b * b;

    return Math.sqrt(c) ;
  }

}
