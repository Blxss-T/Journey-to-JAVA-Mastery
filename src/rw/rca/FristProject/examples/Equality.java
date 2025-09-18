package rw.rca.FristProject.examples;

public class Equality {
    public static void main(String[] args) {
//        String s1=new String("Hello");
//        String s2=new String("Hello");
//        String s3=new String("World");
//        String s4=s1;
        Integer a=10;
        Integer b=10;
        //Reference equality:means they are located in the same memory
        if(a==b){
            System.out.println("S1 and s4 are equal");
        }else{
            System.out.println("S1 and s4 are not equal");
        }
        //Object Equality:have the same content
        if (a.equals(b)) {
        System.out.println("S1 and s2 have the same content");
    }else{
            System.out.println();
        }
        }

}
