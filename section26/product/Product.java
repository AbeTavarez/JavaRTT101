package product;

public abstract class Product {
    private double price;
    private String color;
    private String brand;

    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void fold() {
        System.out.println("Folding my " + this.brand + this.getClass().getSimpleName());
    }

}
