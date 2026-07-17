package classComponents.constructors;

public class Product {
    int id;
    String name;
    int price;
    public Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Product(){

    }
    public Product(Product product){
        this.id = id = 101;
        this.name = name = "Mobile";
        this.price = price = 82000;
        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
    }

    static void main(String[] args) {
        Product product = new Product(101, "Mobile", 82000);
        Product product1 = new Product();
        Product product2 = new Product(product);
    }
}
