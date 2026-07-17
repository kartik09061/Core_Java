package classComponents.blocks;

public class Demo2 {
    static {
        System.out.println("Static BLock");
    }
    {
        System.out.println("Instance BLock");
    }
    public Demo2(){
        System.out.println("Zero Param constructor");
    }
    public Demo2(int a){
        System.out.println("Param constructor");
    }

    static void main(String[] args) {
        Demo2 demo2 = new Demo2(20);
    }
}
