package operators.conditionalOperator;

public class Demo4 {
    static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        int number3 = 300;
        System.out.println(number1 > number2 && number1 > number3 ? number1 :
                number2 > number1 && number2 > number3 ? number2 :
                number3);
    }
}
