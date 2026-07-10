package controlStatements.loopingControlStatements.forDemos;

public class FactorsDemo {
    public static void main(String []args){
       int number = 28;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0 ){
                System.out.println(i);
            }
        }
    }

    }



