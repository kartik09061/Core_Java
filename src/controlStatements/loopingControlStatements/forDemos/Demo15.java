package controlStatements.loopingControlStatements.forDemos;

public class Demo15 {
    static void main(String[] args) {
        for (int left = 0 , right = 10; left < right; left ++ , right --) {
            System.out.println(left + "\t" + right);
        }
    }
}
