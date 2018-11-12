
package array_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(20);
        number.add(-3);
        number.add(5);
        number.add(1);
        number.add(15);
        number.add(9);
        
        System.out.println("Before Sorting: "+number);
        
        //Sorting ArrayList in Ascending Order
        Collections.sort(number);
         System.out.println("After Sorting: "+number);
         
         //Sorting ArrayList in Descending Order
         Collections.sort(number,Collections.reverseOrder());
          System.out.println("Descending Order: "+number);        
    }
}
