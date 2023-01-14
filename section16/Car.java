package section16;

import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // copy constructor
    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public void drive(){
        System.out.println("This " + this.year + " " + this.make + " is driving...");
    }


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] newParts){
        this.parts = Arrays.copyOf(newParts, newParts.length)
    }

    public String toString(){
        return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(parts) + ".\n";
    }

}
