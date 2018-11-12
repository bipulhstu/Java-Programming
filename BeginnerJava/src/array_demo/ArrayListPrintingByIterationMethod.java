
package array_demo;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListPrintingByIterationMethod {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = "+number.size());
        
        ///Adding elements in the ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        ///printing ArrayList by Iteration method
        ///Declaring Iterator
        Iterator itr = number.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
            
        }
        System.out.println();
        System.out.println("Size = "+number.size());
    }
}
