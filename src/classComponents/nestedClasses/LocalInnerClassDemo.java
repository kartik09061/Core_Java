package classComponents.nestedClasses;

public class LocalInnerClassDemo {
    static void main(String[] args) {
        class LocalInnerClass{
            int a = 100;
            void Method() {
                System.out.println("Inner Class Method");


            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.Method();
        System.out.println(localInnerClass.a);
    }
}
