package controlStatements.loopingControlStatements.forDemos;

public class DivisionWithoutOperator {
    static void main(String[] args) {
        int num1 = 17;
        int num2 = 3;
        int quotient = 0;
        for (;num1>=num2;quotient++) {
            num1-= num2;

        }
        System.out.println("quotient :"+quotient);
        System.out.println("Remainder :"+num1);
    }
}
