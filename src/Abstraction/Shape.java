package Abstraction;

public abstract class  Shape {
    private String color;
    public Shape (){}
    public Shape (String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printMe(){
        System.out.println("I am a shape.");
    }
    //the subclasses are the ones to give the implementation of the method
    //in fact they MuST five the implementation of the method
    public abstract double area();

}
