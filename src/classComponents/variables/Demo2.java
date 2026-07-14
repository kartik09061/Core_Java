package classComponents.variables;

public class Demo2 {
    static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        Students s4 = new Students();
        Students s5 = new Students();
        Students.collegeName = "ICEM";
        System.out.println(Students.collegeName);
    }
}
