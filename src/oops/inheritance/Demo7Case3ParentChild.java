package oops.inheritance;

public class Demo7Case3ParentChild {
    static void main(String[] args) {
        // Parent parent = new Child():
        // 1. Present only in parent class ----> Access it from parent class
        // 1. Present only in child class ------> CTE
        // 1. Present  in both class ------> variables from parents and method from child

        class Parent{
         int a = 100;

         void m1(){
             System.out.println("Parent Method");
         }
            int x = 10;
            void m3(){
                System.out.println("Parent m3");
            }
        }
        class Child extends Parent{
            int b = 200;
            void m2(){
                System.out.println("Child Method");
            }
            int x = 20;
            void m3(){
                System.out.println("Child m3");
            }

        }
        Parent parent = new Child();
        System.out.println("1. Members only present in parent class");
        parent.m1();
        System.out.println(parent.a);

        System.out.println();

        System.out.println("2. Members only Present in child class gives CTE");
       // System.out.println(parent.b);
      //  parent.m2();
        System.out.println();

        System.out.println("3. Members Present in both classes variables from parent and methods from child");
        parent.m3(); //---> value from parent
        System.out.println(parent.x); //---> child class method
    }
}
