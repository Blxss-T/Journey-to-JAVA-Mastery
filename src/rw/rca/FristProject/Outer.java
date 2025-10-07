package rw.rca.FristProject;

public class Outer {
    public static  String message ="Hello";
    static class NestedDemo{
        public static void print(){
            System.out.println("Message from static class:"+message);
        }
        public void printAgain(){
            System.out.println("Message Again: "+message);
        }
    }
    public class InnerClass{
        public void display(){
            System.out.println("Message from non-static"+"Nested class: " +message);
        }
    }
}
