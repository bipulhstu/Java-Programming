
package array_demo;

import java.util.ArrayList;


public class ArrayListDeclarationAndPrinting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = "+number.size());
        
        ///Adding elements in the ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        ///printing elements of  the ArrayList
        System.out.println(number);
        System.out.println("Size = "+number.size());
    }
}
