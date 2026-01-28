abstract class Shape {
    abstract double area(); 
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    private double radius;
    public Circle(double r) {
        radius = r;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape implements Drawable {
    private double length, width;
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    @Override
    double area() {
        return length * width;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        
        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());

        Drawable d1 = (Drawable) c;
        Drawable d2 = (Drawable) r;
        d1.draw();
        d2.draw();
    }
}
