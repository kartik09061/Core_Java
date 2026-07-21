package oops.finalKeyword;

public class Demo3 {
    static void main(String[] args) {
        class Student{
          final int id;
          final String name;
            final static String collegeName = "pu";

            Student(int id , String name){
                this. name = name;
                this. id = id ;
            }
        }
        Student student = new Student(101, "Kartik");


    }
}
