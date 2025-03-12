package U7T3;

import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        /* to be implemented in part (a) */
        double sum = 0;
        for (int i = 0; i < check.size(); i++) { //gets the price of each item in the array, and adds them together
            sum += check.get(i).getPrice();
        }
        return sum;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        /* to be implemented in part (b) */
        if (totalPrices() < 40.0) { //criteria 1
            return false;
        }
        for (int i = 0; i < check.size(); i++) { //checks if any item is a daily special, and if it is, reject coupon
            if (check.get(i).isDailySpecial() == true) {
                return false;
            }
        }
        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        /* to be implemented in part (c) */
        double initualcost = totalPrices();
        double couponDiscount = 0;
        double tip = 0;
        if (couponApplies()) {
            couponDiscount = initualcost * 0.25;
        }

        int numberofPeople = 0;
        for (int i = 0; i < check.size(); i++) { //counting the number of people
            if (check.get(i).isEntree()) {
                numberofPeople++;
            }
        }

        if (numberofPeople >= 6) {
            tip = initualcost * 0.2;
        }
        return initualcost - couponDiscount + tip; //does this as coupon and tip references the initual cost, not after the discount
    }
}


