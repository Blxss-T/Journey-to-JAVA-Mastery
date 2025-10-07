public class Exercise01 {
    public static void main (String[] args){
        A a1= new A();
        a1.setMessage("I love the Lord!");
        B b1 =new B();
        b1.setMessage("Welcome back to this channel");
        System.out.println(a1.getMessage());
        a1.hello();
        b1.hello();
        System.out.println(b1.getMessage());
    }
}
