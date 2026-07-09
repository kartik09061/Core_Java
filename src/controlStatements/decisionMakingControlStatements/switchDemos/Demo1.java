package controlStatements.decisionMakingControlStatements.switchDemos;

public class Demo1 {
    static void main(String[] args) {
        int monthNumber = 13;
        switch (monthNumber){
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("JUne");
            case 7 -> System.out.println("july");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sept");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println("Invalid Month Number");
        }
    }
}
