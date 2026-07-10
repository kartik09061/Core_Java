package controlStatements.loopingControlStatements.forDemos;

public class PerfectNumberDemo {
    static void main(String[] args) {
        int number = 6;
        int sumOfFactors = 0;
        for (int i = 1; i <= number/2 ; i++) {
            if (number % i == 0){
                System.out.println(i);
                sumOfFactors += i;
            }

        }
        System.out.println(number==sumOfFactors ? "perfect" :"Not Perfect" );
    }
}
