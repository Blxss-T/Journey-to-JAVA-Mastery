package Shape;

public class Square extends Shape{
    private int side ;
    public void perimeter(int side){
        System.out.println("The perimeter is "+ getSide()*getSide());
    }

    public Square(int side) {
        this.side = side;
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public void printMe(){
        System.out.println("I am a square");
    }
}
