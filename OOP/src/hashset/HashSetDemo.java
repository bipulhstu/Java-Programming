
package hashset;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruitsName = new HashSet<String>();
        
        fruitsName.add("Apple");
        fruitsName.add("Banana");
        fruitsName.add("Mango");
        fruitsName.add("Coconut");
        fruitsName.add("Strawberry");
        
        System.out.println(fruitsName);
        System.out.println("Size = "+fruitsName.size());
        
        fruitsName.remove("Apple");
        System.out.println(fruitsName);
        
        fruitsName.clear();
        System.out.println(fruitsName);
        
        boolean value = fruitsName.isEmpty();
        System.out.println(value);
    }
}
