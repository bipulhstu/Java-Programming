
package array_demo;

import java.util.ArrayList;


public class ArrayListPrintingByForEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = "+number.size());
        
        ///Adding elements in the ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        ///printing elements of  the ArrayList by for each loop
        for (int x: number)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Size = "+number.size());
    }
}
