package controlStatements.loopingControlStatements.forDemos;

public class PrimeNumbersDemo {
    static void main(String[] args) {
        int number = 13;
        boolean isPrime = true;
        for (int i = 2; i <= number/2 ; i++) {
            if (number % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "number is prime" : "number is not prime");
    }
}
