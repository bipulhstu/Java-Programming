
package number_system_conversion;


public class NumberConversionDemo {
    public static void main(String[] args) {
        //Binary to Decimal Conversion
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary "+binary+" = "+decimal);
        
        //Octal to Decimal Conversion
        String octal = "675";
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println("Octal  "+octal+"  = "+decimal2);
        //Binary to Decimal Conversion
        String hexadecimal = "A";
        Integer decimal3 = Integer.parseInt(hexadecimal, 16);
        System.out.println("Hexadecimal "+hexadecimal+" = "+decimal);
    }
}
