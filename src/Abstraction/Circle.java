package Abstraction;

public class Circle extends Shape {
   private Double radius;
   public Circle (){}

    public Circle(String color, Double radius) {
        super(color);
        this.radius = radius;
    }
    public void perimeter() {
        System.out.println("The perimeter is" + getRadius() * 2 * 3.1472);
    }

    public Double getRadius(){
       return this.radius;
    }
    public void setRadius(Double radius){
       this.radius=radius;
    }
    @Override
    public void printMe(){
        System.out.println("I am a square");
    }

    public double area(){
       return getRadius() * getRadius() * Math.PI ;
    }
}
