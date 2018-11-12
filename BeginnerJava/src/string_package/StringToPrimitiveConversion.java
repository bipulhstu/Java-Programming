
package string_package;

public class StringToPrimitiveConversion {
    public static void main(String[] args) {
        //1. string to integer 
        String s = "32";
        int i = Integer.parseInt(s);
        System.out.println("i = "+i);
        
        //2. string to double 
        String s1 = "32";
        double d = Double.parseDouble(s1);
        System.out.println("d = "+d);
        
        //1. string to integer 
        String s2 = "32";
        int j = Integer.valueOf(s2);
        System.out.println("j = "+j);
        
        //2. string to double 
        String s3 = "32";
        double d2 = Double.parseDouble(s3);
        System.out.println("d2 = "+d2);
        
        
    }
}
