package classComponents.thisKeyword;

public class Demo1 {
    int a ;
    public void m1(){
        this.a = 10;
        System.out.println(a);
    }

    static void main(String[] args) {
        Demo1 demo = new Demo1();
        demo.m1();
    }
}
