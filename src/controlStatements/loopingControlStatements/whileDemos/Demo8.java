package controlStatements.loopingControlStatements.whileDemos;

public class Demo8 {
    static void main(String[] args) {
        int number = 153;
        int sum = 0;
        int originalNumber = number;
        while (number > 0){
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number /= 10;
        }
        System.out.println(sum == originalNumber? "Amstrong" : "Not Amstrong");
    }
}
