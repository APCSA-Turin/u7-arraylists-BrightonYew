package U7T1;

import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList <Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory () {
        return inventory;
    }

    public void addCar (Car car) {
        inventory.add(car);
    }

    public boolean swap (int int1, int int2) {
        if (int1 > inventory.size() - 1 || int2 > inventory.size() - 1) {
            return false;
        }

        Car temp = inventory.get(int1);
        inventory.set(int1, inventory.get(int2));
        inventory.set(int2, temp);
        return true;
    }
}
