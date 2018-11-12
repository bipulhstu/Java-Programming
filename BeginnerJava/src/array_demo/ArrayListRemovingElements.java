
package array_demo;

import java.util.ArrayList;

public class ArrayListRemovingElements {
    public static void main(String[] args) {
         ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = "+number.size());
        
        ///Adding elements in the ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        ///Before Removing Elements
        System.out.println("ArrayList contains :"+number);
        System.out.println("Size = "+number.size());
        
        //Removing Elements
        number.remove(2); //remove element from index 2
        System.out.println("After removing ArrayList contains :"+number);
        System.out.println("Size = "+number.size());
        
        //Removing all elements
        number.removeAll(number);
        System.out.println("After all removing ArrayList contains :"+number);
        System.out.println("Size = "+number.size());
        
    }
}
