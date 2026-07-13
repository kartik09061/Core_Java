package userInput.scannerDemoes;

import java.util.Scanner;

public class Demo3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1 == number2);
        System.out.println(number1 + number2);
    }
}
