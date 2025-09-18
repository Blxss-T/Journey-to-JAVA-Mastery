package rw.rca.FristProject.Pillars;

public class Person {
    private String firstName;
    private String lastName;
    int age;
    private String gender;

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender=gender;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Person() {};

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
    public void printMe(){
        System.out.println("I am a person");
    }
    public void printMe(String title){
        System.out.println("I am "+title);
    }

}
