package Box;

public class BoxShiping extends BoxWeight{
    private int cost;
    private String address;
    public BoxShiping(int height, int width, int depth, int weight, int cost, String address) {
        super(height, width, depth, weight);
        this.cost = cost;
        this.address = address;
    }
    public BoxShiping() {};
    public void printMe(){
        System.out.println("I am shipping");
    }
    public int getCost() {
        return cost;
    }
    public String getAddress() {
        return address;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "The width is "+getWidth()+",the depth is"+getDepth()+", the height is"+getHeight() +"the cost"+getCost()+", the address"+getAddress();
    }

}
