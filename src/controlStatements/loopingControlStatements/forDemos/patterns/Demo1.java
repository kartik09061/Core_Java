package controlStatements.loopingControlStatements.forDemos.patterns;

public class Demo1 {
    static void main(String[] args) {
        for (int row = 1; row <=5 ; row++) {
            for (int colm = 1; colm <=5 ; colm++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
