package classComponents.variables;

public class Demo4 {
    int x ;
    int y ;
    int z ;
    static int p = 101;

    static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println("Local Variable"+x);
        System.out.println("Local Variable"+y);
        System.out.println("Local Variable"+z);
        System.out.println("Static Variable"+Demo4.p);
        Demo4 demo = new Demo4();
        System.out.println("Instance Variable"+demo.x);
        System.out.println("Instance Variable"+demo.y);
        System.out.println("Instance Variable"+demo.z);

    }
    }

