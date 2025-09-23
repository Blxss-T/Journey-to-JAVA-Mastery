import Box.Box;
import Box.BoxWeight;
import Box.BoxShiping;

public class Main {
    public static void main(String[] args) {
      Box box1= new Box(100,100,100);
      box1.printMe();
      System.out.println(box1.toString());
      BoxWeight boxWeight1= new BoxWeight(101,110,120,980);
      boxWeight1.printMe();
      System.out.println(boxWeight1.toString());
      BoxShiping boxShiping1= new BoxShiping(100,100,100,98,52,"Rubavu");
      boxShiping1.printMe();
      System.out.println(boxShiping1.toString());


        }
    }
