package rw.rca.FristProject.Polymorphism;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    //Encapsulation is a process of hiding data by making private all properties of a class and providing public methods to access them.(Getters and Setters).
    //Basically restricting data access.
    //----------------Setters-------------------------
    //A method to set value of property


    public void setFirstName(String firstName) {
        firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age>=0)
        this.age = age;
    }
    //---------------Getter-------------
    public String getLastName(){
        return this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public int getAge(){
        return this.age;
    }

    public Person(){};
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, int age, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(int age,String firstName,  String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(int age,  String lastName) {
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName,  String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    };
    //Every object in java has an object to string and we can overide

    public String toStringc(){
        return this.firstName+" "+this.lastName +" is "+this.age+" years old";
    };


}
