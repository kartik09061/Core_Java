package controlStatements.loopingControlStatements.forDemos.patterns;

public class Demo4 {
    static void main(String[] args) {
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}
