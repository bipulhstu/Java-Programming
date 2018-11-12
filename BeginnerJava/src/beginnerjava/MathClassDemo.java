
package beginnerjava;


public class MathClassDemo {
    public static void main(String[] args) {
        int x = 20;
        int y =10; 
        
        int max = Math.max(x, y);
        System.out.println("Maximum is "+max);
       
        
        int min = Math.min(x, y);
        System.out.println("Minimum is "+min);
        
        int absolute = Math.abs(y);
        System.out.println("Absolute of y is "+absolute);
        
        double power = Math.pow(x, y);
        System.out.println("x to the power of y is "+power);
        
        int round = Math.round(8.8f);
        System.out.println("Round of 8.8 is "+round);
        
        double pi= Math.PI;
        System.out.println("Pi = "+pi);
    }
}
