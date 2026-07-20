package oops.inheritance;

public class Demo1 {
    static void main(String[] args) {
        class A{
            int a = 100;
            void a1(){
                System.out.println("Instance Method Of A");
            }
            A(){
                System.out.println("A Class Constructor");
            }
        }
        class B extends A{
            int b = 100;
            void b1(){
                System.out.println("Instance Method Of B");
            }
            B(){
                System.out.println("Constructor Of B");
            }

        }
        B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);
        b.a1();
        b.b1();
    }
}
