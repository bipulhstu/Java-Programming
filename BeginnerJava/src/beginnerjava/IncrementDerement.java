
package beginnerjava;

public class IncrementDerement {
    public static void main(String[] args) {
        int x = 25;
        int y;
        
        y = --x; //pre decrement x = 24
        System.out.println("y is "+y);
        
        y= x--; //post decrement x = 24
        System.out.println("y is "+y);
        
        y = ++x; //pre increment x = 24
        System.out.println("y is "+y);
        
        y = x++; //post increment x = 24
        System.out.println("y is "+y);
    }
}
