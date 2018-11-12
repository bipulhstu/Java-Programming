
package oop;

public class WrapperClassDemo {
    public static void main(String[] args) {
        ///primitive to object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = "+y);
        
        Integer z = x; //Autoboxing
        System.out.println("z = "+z);
        
        ///object to primitive
        Double d = new Double(10.24);
        double e = d.doubleValue();
        System.out.println("e = "+e);
        
        double f = d;   //Unboxing
        System.out.println("f = "+f);
    }
}
