
package beginnerjava;


public class BitwiseDemo {
    public static void main(String[] args) {
        int a = 32;
        int b =12;
        int c;
        
        c = a & b;
        System.out.println("c is "+c);
        
        c = a | b;
        System.out.println("c is "+c);
        
        c = a ^ b;
        System.out.println("c is "+c);
    }
}
