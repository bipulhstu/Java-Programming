
package string_package;


public class PrimitiveToStringConversion {
    public static void main(String[] args) {
        
        //integer to string
        int i  = 100;
        String s = Integer.toString(i);
        System.out.println("s = "+s);
        
        ///double to string
        double d  = 100.00;
        String s1 = Double.toString(d);
        System.out.println("s1 = "+s1);
        
        //boolean to string
        boolean b = true;
        String s2 = Boolean.toString(b);
        System.out.println("s2 = "+s2);
    }
}
