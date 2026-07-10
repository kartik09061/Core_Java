package controlStatements.loopingControlStatements.forDemos.patterns;

public class Demo12 {
    static void main(String[] args) {
        for (int row = 5; row >=1 ; row--) {
            for (int space = 1; space <= 5 - row ; space++) {
                System.out.print(" ");
            }
            for (int value = 1; value <=row ; value++) {
                System.out.print(" *");

            }
            System.out.println();
        }
    }
}
