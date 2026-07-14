package classComponents.variables;

public class Demo1 {
    static void main(String[] args) {
        Students s1 = new Students();
        s1.studentId = 101;
        s1.studentName = "Kartik";
        s1.studentAddress = "pune";
        s1.studentAge = 23;
        s1.studentGender = "Male";
        s1.studentCourse = "MCA";
        System.out.println(s1.studentId);
        System.out.println(s1.studentName);
        System.out.println(s1.studentAddress);
        System.out.println(s1.studentGender);
        System.out.println(s1.studentAge);
        System.out.println(s1.studentCourse);
    }
}
