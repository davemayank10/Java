import java.lang.Math;

interface Shape2D {
    double area();
}

interface Shape3D {
    double volume();
}

abstract class Shape {
    public abstract void display();
}

class Circle extends Shape implements Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * Math.pow(radius, 2);
    }

    public void display() {
        System.out.println("Area of the circle: " + area());
    }
}

class Sphere extends Shape implements Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return (4.0 / 3.0) * 3.14 * Math.pow(radius, 3);
    }

    public void display() {
        System.out.println("Volume of the sphere: " + volume());
    }
}

public class Pra_28 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();

        Sphere sphere = new Sphere(5);
        sphere.display();
    }
}


/*
Output:
Area of the circle: 78.5
Volume of the sphere: 523.3333333333334
*/
