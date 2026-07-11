package controlStatements.transferControlStatements.returnDemos;

public class Demo {
    static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if (i % 5 == 0) {
                return;
            }
            System.out.println(i);
        }
            System.out.println("Rest of the main");
    }

}
