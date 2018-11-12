
package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();
        
        countryNames.add("Afghanistan");
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add(5, "Japan");
        countryNames.addFirst("America");
        countryNames.addLast("Canada");
        //countryNames.remove(5);
        //countryNames.removeFirst();
        //countryNames.removeLast();
        
        for (String country: countryNames){
            System.out.println(country);
        }
        System.out.println("Size of the linked list : "+countryNames.size());
        System.out.println("First element : "+countryNames.getFirst());
        System.out.println("First element : "+countryNames.getLast());
        
        countryNames.clear();
        System.out.println(countryNames);
    }
}
