package Abstraction2;

public class Square implements Shape {
    private int Side;

    public Square(int side) {
        Side = side;
    }

    public int getSide() {
        return Side;
    }

    public void setSide(int side) {
        Side = side;
    }

    public double area(){
        return getSide()*getSide();

 }
 public void printMe(){
     System.out.println("I am Me");
 }

}
