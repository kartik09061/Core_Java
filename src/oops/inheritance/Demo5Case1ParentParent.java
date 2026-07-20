package oops.inheritance;

public class Demo5Case1ParentParent {
    static void main(String[] args) {
        class Parent{
            int v1 = 100;
            void m1(){
                System.out.println("Parent Method");
            }
        }
        class Child extends Parent{
            int v2 = 100;
            void m2(){
                System.out.println("Child Method");
            }
        }
        Parent parent = new Parent();
        System.out.println(parent.v1);
        parent.m1();
        //Parent class can not access child class members
       /* System.out.println(parent.v2);//CTE
        parent.m2();//CTE */
    }
}
