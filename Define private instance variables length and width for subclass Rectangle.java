abstract class Shape {
    public abstract double getArea();
    public abstract double perimeter();
    
    void display() {
        System.out.println("The area of the shape is: " + getArea());
        System.out.println("The Perimeter of the shape is: " + perimeter());
    }
}

class Circle extends Shape {
   
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
  
    public double getArea() {
        return Math.PI * radius * radius; 
    }

 
    public double perimeter() {
        return 2 * Math.PI * radius; 
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); 
        circle.display(); 
    }
}
  
