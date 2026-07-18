package classComponents.nestedClasses;

public class InnerClassDemo {
    static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.a);
        outer.m1();

        Outer.Inner inner = outer.new Inner();

        System.out.println(inner.b);
        inner.m2();
    }
}
