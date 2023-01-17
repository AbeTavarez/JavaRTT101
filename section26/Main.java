import product.Shirt;
import product.Shirt.Size;
import product.Product;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(10.99, "RED", "Nike", Size.SMALL);
        shirt.fold(); // fold is defined in the super class Product
        productStore(shirt);


    }

    public static void productStore(Product product) {
        System.out.println("Thanks for purchasing the " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase()  + " for " + product.getPrice());
    }

}
