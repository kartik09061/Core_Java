package controlStatements.loopingControlStatements.whileDemos;

public class Demo6 {
    static void main(String[] args) {
        int number = 456;
        while (number > 0){
            System.out.println(number);
            number = number/10;
        }
    }
}
