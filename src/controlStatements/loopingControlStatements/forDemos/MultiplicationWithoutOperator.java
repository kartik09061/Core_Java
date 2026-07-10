package controlStatements.loopingControlStatements.forDemos;

public class MultiplicationWithoutOperator {
    static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        for (int i = 1; i <= num1 ; i++) {
          sum += num2;
        }
        System.out.println(sum);
    }
}
