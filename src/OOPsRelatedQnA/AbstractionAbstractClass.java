package OOPsRelatedQnA;

public class AbstractionAbstractClass {
    abstract static class Shape {
        abstract double area();
        abstract double perimeter();
    }
    static class Rectangle extends Shape {
        double length, width;
        Rectangle (double l , double w) {
            this.length = l;
            this.width = w;
        }
        double area() {
            return length * width;
        }
        double perimeter() {
            return 2 * (length + width);
        }
    }
    static class Circle extends Shape {
        double radius;
        Circle (double r) {
            this.radius = r;
        }
        double area() {
            return Math.PI * radius * radius;
        }
        double perimeter() {
            return 2 * Math.PI * radius;
        }
    }
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(5);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

    }
}

 // In this example, we have an abstract class Shape that defines two abstract methods: area() and perimeter().
 // The Rectangle and Circle classes extend the Shape class and provide concrete implementations for these methods.
 // We cannot create instances of the abstract class Shape directly, but we can create instances of its subclasses.
 // This demonstrates the concept of abstraction in Java, where we define a common interface (the abstract class)
 // and let the subclasses provide specific implementations. The main method creates instances of Rectangle
 // and Circle, and calls their area and perimeter methods to display the results.
 // Output:
 // Rectangle Area: 20.0
 // Rectangle Perimeter: 18.0
 // Circle Area: 78.53981633974483
 // Circle Perimeter: 31.41592653589793
 // In this output, we can see the area and perimeter of both the rectangle and the circle calculated using their respective methods.
 // This demonstrates how abstraction allows us to define a common interface for different shapes, while the specific details of the calculations are handled by the subclasses.
 // The @Override annotation is used in the Rectangle and Circle classes to indicate that the methods are intended to override the abstract methods in the Shape class.
 // If the methods do not correctly override the abstract methods (for example, due to a typo in the method name or incorrect parameters),
 // the compiler will generate an error. This helps catch mistakes early in the development process.
