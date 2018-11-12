
package number_system_conversion;

public class NumberConversionDemo2 {
    public static void main(String[] args) {
        //Decimal to Binary
        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary of "+decimal+" is = "+binary);
        
        //Decimal to Octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal of "+decimal+" is = "+octal);
        
        //Decimal to Hexadecimal
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal of "+decimal+" is = "+hex);
    }
}
