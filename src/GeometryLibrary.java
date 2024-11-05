
public class GeometryLibrary {
    // Static nested class for Circle
    public static class Circle {
    private double radius;
    public Circle(double radius) {
    this.radius = radius;
    }
    public double calculateArea() {
    return Math.PI * radius * radius;
    }
    }
    // Static nested class for Rectangle
    public static class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
    }
    public double calculateArea() {
    return width * height;
    }
    }
   }
