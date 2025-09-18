package rw.rca.FristProject.examples;

public class PowerOfNumber {
    public static int powerNumber(int a,int b){
        int product = 1;
        for (int i=1;i<=b;i++){
          product *=a;
        }
        return product;
    }
    public static void  main(String [] args){
        System.out.println("The power of 5 to 5" +powerNumber(5,5));}
}

