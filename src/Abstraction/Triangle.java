package Abstraction;

public abstract class Triangle extends Shape {
    public abstract double perimeter ();

    public Triangle() {
    }

    public Triangle(String color) {
        super(color);
    }

}
