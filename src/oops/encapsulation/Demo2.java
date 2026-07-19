package oops.encapsulation;

public class Demo2 {
    static void main(String[] args) {
        Product product = new Product(20000.34,"Mobile");
        product.setPrice(-10000);
        product.setName("Laptop");
        System.out.println(product.getPrice());
        System.out.println(product.getName());
    }
}
