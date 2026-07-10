package controlStatements.loopingControlStatements.forDemos;

public class Demo11 {
    static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <=500 ; i+= 5) {
            System.out.println(i);
            count++;
        }
        System.out.println("Number of iterations :"+count);
    }
}
