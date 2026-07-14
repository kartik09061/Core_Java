package classComponents.variables;

public class Products {
    int productId = 101;
    String productName = "Laptop";
    double productPrice = 2002.11;

    static void main(String[] args) {
        Products product = new Products();
        System.out.println(product.productId);
        System.out.println(product.productName);
        System.out.println(product.productPrice);
    }
}
