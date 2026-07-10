package controlStatements.loopingControlStatements.forDemos.patterns;

public class Demo10 {
    static void main(String[] args) {
        for (int row = 1; row <=5 ; row++) {
            for (int space = 1; space <= 5-row ; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <=row ; star++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
