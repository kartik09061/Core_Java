package controlStatements.transferControlStatements.breakDemos;

public class Demo4 {
    static void main(String[] args) {
        int[] array = {10, 2, 3, 5};
        for (int temp : array)
        {
            System.out.println(temp);
            break;
        }
    }
}