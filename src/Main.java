
public class Main {
    public static void main(String[] args) {
    GeometryLibrary.Circle circle = new GeometryLibrary.Circle(5.0);
    double circleArea = circle.calculateArea();
    System.out.println("Circle Area: " + circleArea);
    GeometryLibrary.Rectangle rectangle = new GeometryLibrary.Rectangle(4.0, 6.0);
    double rectangleArea = rectangle.calculateArea();
    System.out.println("Rectangle Area: " + rectangleArea);
    

    }
   }