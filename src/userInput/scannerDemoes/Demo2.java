package userInput.scannerDemoes;

import java.util.Scanner;

public class Demo2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Enter The Operation :");
        String operation = scanner.next();
        switch (operation){
            case  "+" ->System.out.println(number1 + number2);
            case "-" -> System.out.println(number1 - number2);
            case "*" -> System.out.println(number1 * number2);
            case "/" -> System.out.println(number1 / number2);
            case "%" -> System.out.println(number1 % number2);
            default -> System.out.println("Invalid OPerations");
        }
    }
}
