package oops.finalKeyword;

public class Demo6Immutable {
    static void main(String[] args) {
        final class Person{
            final private int id;
            final private String name;
            Person(int id , String name){
                this.id = id;
                this.name = name;
            }
        }
        Person person = new Person(1, "Kartik");
    }
}
