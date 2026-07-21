package oops.finalKeyword;

public class Demo2 {
    static void main(String[] args) {
        final int a = 10;
       // a = 20; // CTE ----> final variable value cannot be reassigned.
        System.out.println(a);
    }
}
