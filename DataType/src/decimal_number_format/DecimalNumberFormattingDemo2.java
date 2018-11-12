
package decimal_number_format;

import java.text.DecimalFormat;

public class DecimalNumberFormattingDemo2 {
    public static void main(String[] args) {
        DecimalFormat ob = new DecimalFormat("0.00");
        double x = 10.423432;
        System.out.println("x = "+ob.format(x));
        
    }
}
