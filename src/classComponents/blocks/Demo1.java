package classComponents.blocks;

public class Demo1 {
    {
        System.out.println("Instance Block");
    }
    static {
        System.out.println("Static Block");
    }

    static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println("Main Method");
    }
    }

