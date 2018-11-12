
package datatype;


public class DataType {

    
    public static void main(String[] args) {
        boolean b =true;
        char c = 'a';
        short s=1234;
        int i = 342422;
        float f = 10.2f;
        double d = 10.3;
        
        System.out.println("boolean b = "+b);
        System.out.println("character c = "+c);
        System.out.println("short s = "+s);
        System.out.println("integer i = "+i);
        System.out.println("float f = "+f);
        System.out.println("double d = "+d);
        
        
        System.out.println();
        //Print using format specifier
        System.out.printf("boolean b = %b\n",b);
        System.out.printf("character c = %c\n",c);
        System.out.printf("short s = %d\n",s);
        System.out.printf("integer i = %d\n",i);
        System.out.printf("float f = %.2f\n",f);
        System.out.printf("double d = %.3f\n",d);
    }
    
}
