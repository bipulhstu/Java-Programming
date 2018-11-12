
package beginnerjava;

import java.util.Scanner;


public class TemperatureDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels, faren;
        System.out.print("Farenheit = ");
        faren=input.nextDouble();
        
        cels = 0.555555 *(faren-32);
        System.out.println("Celcius = "+cels);
              
    }
}
