package classComponents.nestedClasses;

public class StaticDemo {
   static int staticVariableOuter = 100;
   static void staticMethodOuter(){
       System.out.println("Static Outer Method"
       );
   }

   static class Nested{
       int a = 10;
       static int b = 20;
       void m1(){
           System.out.println("Instance Method");
       }
       static void m2(){
           System.out.println("Static Method");
       }
   }
}
