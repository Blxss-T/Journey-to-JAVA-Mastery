package rw.rca.FristProject.examples;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;

public class firstprogram  {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Set<String> districts = new TreeSet<String>();
        districts.add("Nyabihu");
        districts.add("Rubavu");
        districts.add("Gasabo");
        districts.add("Bugesera");
        districts.add("Rubavu");
        for(String district:districts){
            System.out.println(district);
        }

    }
}
