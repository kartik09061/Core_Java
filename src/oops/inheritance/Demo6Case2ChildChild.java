package oops.inheritance;

public class Demo6Case2ChildChild {
    static void main(String[] args) {
        class Parent{
            int v1 = 100;
            int x =50;
            void m1(){
                System.out.println("Parent Method");
            }
            void display(){
                System.out.println("parent Display");
            }
        }
        class Child extends Parent{
            int v2 = 100;
            int x = 70;
            void m2(){
                System.out.println("Child Method");
            }
            void display(){
                System.out.println("Child Display");
            }
        }
        Child child = new Child();
        System.out.println(child.v1);
        System.out.println(child.v2);
        child.m1();
        child.m2();
        System.out.println(child.x);
        child.display();
    }
}
