package U7T2;
import java.util.ArrayList;
import java.util.Arrays;
public class AnotherRunner {
    public static void main(String[] args) {

        Car car1 = new Car("test1", 100);
        Car car2 = new Car("test2", 101);
        Car car3 = new Car("test3", 102);
        Car[] Cararray = {car1, car2, car3};


        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(Cararray));
        System.out.println(carList);
    }
}
