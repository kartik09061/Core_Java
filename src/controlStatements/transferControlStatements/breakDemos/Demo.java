package controlStatements.transferControlStatements.breakDemos;

public class Demo {
    static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {

            if ( !(i%3== 0 || i% 5==0 || i%7==0)){
                System.out.println(i);

            }
        }
    }
}
