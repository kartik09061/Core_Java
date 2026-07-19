package oops.encapsulation;

public class Demo1 {
    static void main(String[] args) {
        Person person = new Person(21 , "Kartik");
        person.setAge(-24);
        person.setName("Kartik");
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
