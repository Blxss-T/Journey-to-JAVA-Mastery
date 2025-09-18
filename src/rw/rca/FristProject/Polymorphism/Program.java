package rw.rca.FristProject.Polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Program {
    public static void main(String[] args) {
        Person person1= new Person();
        Person person2= new Person("Mugisha",10,"Nick");
        System.out.println (person2.getFirstName()+" "+person2.getLastName()+" "+person2.getAge() );
        person1.setFirstName("Kaneza");
        person1.setLastName("Amanda");
        person1.setAge(15);
        System.out.println (person1.toStringc());
Person person3= new Person();
        System.out.println("hihihihi ageee");
System.out.println(person3.getAge() );
person3.setAge(-15);
Person person4= new Person();
System.out.println(person4);


    }

}
