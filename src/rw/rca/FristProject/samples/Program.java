package rw.rca.FristProject.samples;

public class Program{
            public static  void main (String[] args){
                Outer.NestedDemo.print();
                Outer.NestedDemo demo= new Outer.NestedDemo();
                demo.printAgain();
                Outer outer = new Outer();
                Outer.InnerClass inner=outer.new InnerClass();
                inner.display();

            }

        }

