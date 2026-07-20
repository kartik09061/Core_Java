package oops.inheritance;

public class Demo2 {
    static void main(String[] args) {
        class Parent{
            Parent(){
                System.out.println("Parent Class Constructor");
            }
        }
        class Child extends Parent{
            Child(){
                System.out.println("Child Class Constructor");
            }
        }
        Child child = new Child();
    }
}
