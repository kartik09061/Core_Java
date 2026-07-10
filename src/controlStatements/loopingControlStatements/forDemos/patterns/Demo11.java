package controlStatements.loopingControlStatements.forDemos.patterns;

import java.util.Arrays;

public class Demo11 {
    static void main(String[] args) {
        for (int row = 1; row <=5 ; row++) {
            for (int space = 1; space <= 5 - row ; space++) {
                System.out.print(" ");
            }
            for (int value = 1; value <=row ; value++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
