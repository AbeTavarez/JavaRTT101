package product;

public class Shirt extends Product {

    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    public Shirt(double price, String color, String brand,Size size) {
        super(price, color, brand); //call super first
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Fold the shirt by placing the shirt in a flat surface...");
    }


}
