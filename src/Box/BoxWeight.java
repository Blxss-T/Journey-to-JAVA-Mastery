package Box;

public class BoxWeight extends Box {
    public int weight;
    public BoxWeight(int weight) {
        this.weight = weight;
    }
    public BoxWeight() {}

    public BoxWeight(int height, int width, int depth, int weight) {
        super(height, width, depth);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
