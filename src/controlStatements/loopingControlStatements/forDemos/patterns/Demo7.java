package controlStatements.loopingControlStatements.forDemos.patterns;

public class Demo7 {
    static void main(String[] args) {
        int count = 1;
        for (int row = 5; row >=1 ; row--) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(count +" ");
            }
            System.out.println();
            count++;
        }
    }
}
