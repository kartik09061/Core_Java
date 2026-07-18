package classComponents.nestedClasses;

public class Outer {
    int a = 10 ;
    void m1(){
        System.out.println("Outer Class Method");
    }
    class Inner{
        int b = 100;
        void m2(){
            System.out.println("Inner Class Method");
        }

    }
}
