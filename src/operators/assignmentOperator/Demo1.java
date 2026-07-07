package operators.assignmentOperator;


public class Demo1 {
    static void main(String[] args) {
        int a = 20;
        int b = 10 * 20;
        int c = a;
        int d = add(10,20);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        }
        static int add(int num1, int num2){
            return num1 + num2 ;
    }
}
