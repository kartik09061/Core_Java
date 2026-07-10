package controlStatements.decisionMakingControlStatements.switchDemos;

public class Demo3 {
    static void main(String[] args) {
        switch (1){
            case 1 -> {
                System.out.println("one");
                System.out.println("one");
            }
            case 2 -> {
                System.out.println("two");
                System.out.println("two");
            }
            case 3 ->{
                System.out.println("three");
                System.out.println("three");
            }
            default -> System.out.println("invalid number");
        }
    }
}
