package controlStatements.decisionMakingControlStatements.switchDemos;

public class Demo4 {
    static void main(String[] args) {
        String numberToPrint = switch (1) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "invalid number";
        };
        System.out.println(numberToPrint);
    }
}
