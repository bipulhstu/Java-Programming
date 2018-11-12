
package array_demo;

import java.util.ArrayList;

public class ArrayListSomeMethods {
    public static void main(String[] args) {
         ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = "+number.size());
        
        ///Adding elements in the ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        System.out.println("ArrayList contains :"+number);
        System.out.println("Size = "+number.size());
        
        //isEmpty() method
        boolean check;
        check = number.isEmpty();
        System.out.println("ArrayList empty: "+check);
        
        //contains() method
        //check particular element in the ArrayList
        boolean contain;
        contain = number.contains(30);
        System.out.println("30 is in the ArrayList : "+contain);
        
        //indexOf() method
        int pos;
        pos = number.indexOf(40);
        System.out.println("The index of 40 is : "+pos);
        
        //set method
        //replace elements
        number.set(3, 50);
        System.out.println("After setting ArrayList: "+number);
        
        //get method
        int x;
        x = number.get(0);
        System.out.println("The element of index 0 = "+x);
        
        //clear() method
        number.clear();
        System.out.println("After clear the ArrayList :"+number);
    }
}
