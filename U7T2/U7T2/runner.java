package U7T2;

import java.util.ArrayList;


public class runner {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();


        numList.add(3);
        
        
        numList.add(0, 6);
        
        
        numList.add(2, 7);
        
        numList.add(2, 8);
        
        
        numList.set(3, 9);
        
        
        numList.add(1, 2);
        
        numList.add(1, numList.size());
        
        numList.remove(4);
        
        numList.set(4, 0);
        
        
        System.out.println(numList);
        
    }
}
