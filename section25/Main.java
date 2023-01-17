import model.Car;
import static model.Car.TrafficLight.*;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        // we can pass the enum: RED now that we import them.
        car.drive(RED);
    }

}
