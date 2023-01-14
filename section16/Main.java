package section16;

public class Main {
    public static void main(String[] args) {
        // spare parts array
        String[] spareParts = new String[] {"tire","air pump"};

        Car myCar = new Car("Honda", 10000, 2016, "white", spareParts);
        
        
        // using the copy constructor
        Car myOldCar = new Car(myCar);
        
        myCar.drive();
        
        Car myHonda = new Car("Honda", 10000, 2016, "white", spareParts);
        Car myNissan = new Car("Honda", 100000, 2022, "blue", spareParts);
        
        System.out.println(myHonda);
        // myHondaParts.foreach((String part) -> System.out.println(part));

    }
}
