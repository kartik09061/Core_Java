package oops.inheritance;

import java.util.concurrent.Callable;

public class Demo3 {
    static void main(String[] args) {
        class A{
            static {
                System.out.println("A Class Static Block");
            }
            {
                System.out.println("A Class Instance Block");
            }
            A(){
                System.out.println("A Class Constructor");
            }
        }
        class B extends A{
            static {
                System.out.println("B Class Static Block");
            }
            {
                System.out.println("B Class Instance Block");
            }
            B(){
                System.out.println("B Class Constructor");
            }
        }
        class C extends B{
            static {
                System.out.println("C Class Static Block");
            }
            {
                System.out.println("C Class Instance Block");
            }
            C(){
                System.out.println("C Class Constructor");
            }
        }
       C c = new C();

        }
    }

