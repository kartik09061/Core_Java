package oops.encapsulation;

public class Person {
   private int age;
   private String name;
    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }
    public Person(){}
    public void setAge(int age){
        if (age == 0){
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}
