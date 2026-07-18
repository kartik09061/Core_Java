package classComponents.nestedClasses;

public class StaticNestedClassDemo {
    static void main(String[] args) {
        System.out.println(StaticDemo.staticVariableOuter);
        StaticDemo.staticMethodOuter();
        StaticDemo.Nested.m2();
        System.out.println(StaticDemo.Nested.b);

        StaticDemo.Nested nested =  new StaticDemo.Nested();

        System.out.println(nested.a);
        nested.m1();
    }
}
