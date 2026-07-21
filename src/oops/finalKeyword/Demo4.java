package oops.finalKeyword;

public class Demo4 {
    static void main(String[] args) {
        class A{
            final void foo(){
                System.out.println("A foo");
            }
        }
        class B extends A{
            // Final method cannot be overriden
          //  void foo(){ // CTE
         //       System.out.println("B foo");
       //     }
        }
    }
}
