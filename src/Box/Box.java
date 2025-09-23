package Box;

public class Box {
    private int height;
    private int width;
    private int depth;
    public void boxVolume (int height,int width,int depth){
        System.out.println("The volume is");
    };
    public void volume (){
        System.out.println("The volume is: "+ getHeight()*getWidth()*getDepth());
    }
    public void printMe(){
        System.out.println("I am the box my height is "+ getHeight()+" my width is:"+getWidth()+"  my depth is:"+getDepth());
    }
    public Box(){};
    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    @Override
    public String toString() {
       return "{Width:" +getWidth() +",\n" +
               " height:" +getHeight() +",\n" +
               "depth :" +getDepth()+"}";
    }
}
