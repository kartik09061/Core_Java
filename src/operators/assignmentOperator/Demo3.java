package operators.assignmentOperator;

public class Demo3 {
    static void main(String[] args) {
        int number = 123;
        int digit = number % 10;
        System.out.println(digit);
        number = number / 10;

        digit = number % 10;
        System.out.println(digit);
        number = number / 10;

        digit = number % 10;
        System.out.println(digit);
        number = number / 10;

        digit = number % 10;
        System.out.println(digit);
        number = number / 10;
    }
}