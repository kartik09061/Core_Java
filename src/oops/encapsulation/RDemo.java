package oops.encapsulation;

public class RDemo {
    static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setLength(3.17);
        rectangle.setWidth(13.2);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

    }
}