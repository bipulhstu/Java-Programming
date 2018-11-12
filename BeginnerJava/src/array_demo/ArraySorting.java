
package array_demo;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] number = {10, -3, 5, 23, 2};
        Arrays.sort(number);
        
        ///Ascending order
        System.out.println("Ascending :");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);   
        }
        System.out.println();
    
    
    ///Descending order
        System.out.println("Descending :");
      for (int i = 4; i>=0; i--) {
            System.out.print(" "+number[i]);   
        }
        System.out.println();
        
        String [] names = {"Bipul", "Mashiur", "Rana", "Dino", "Sorwar"};
        Arrays.sort(names);
        
        ///Ascending order
        System.out.println("Ascending :");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+names[i]);   
        }
        System.out.println();
    
    
    ///Descending order
        System.out.println("Descending :");
      for (int i = 4; i>=0; i--) {
            System.out.print(" "+names[i]);   
        }
        System.out.println();
       
    }
  
}
