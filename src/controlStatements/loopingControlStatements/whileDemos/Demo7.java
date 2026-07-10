package controlStatements.loopingControlStatements.whileDemos;

public class Demo7 {
    static void main(String[] args) {
        int number = 123;
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
