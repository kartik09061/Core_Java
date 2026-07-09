package controlStatements.decisionMakingControlStatements.ifelseDemos;

public class Demo4 {
    static void main(String[] args) {
        if (isValid()){
            System.out.println("This is a car");
        }
        System.out.println("Rest of the code");

    }
    public static boolean isValid (){
        return false;
    }
}
