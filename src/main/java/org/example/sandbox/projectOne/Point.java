package org.example.sandbox.projectOne;

public class Point {

  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void shiftX(double n) {
    this.x += n;
  }


  public void shiftY(double n) {
    this.y += n;
  }

  // Calculate the distance between this point and another point
  public double distance(Point p2) {
    double dx = this.x - p2.x;
    double dy = this.y - p2.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  // Rotate the point around the origin by a specified angle (radians)
  public void rotate(double angle) {
    double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
    double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
    this.x = newX;
    this.y = newY;
  }

  // (Optional) Override the toString() method for more informative output
  @Override
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }


}