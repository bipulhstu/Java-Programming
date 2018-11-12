
package beginnerjava;
import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius :");
        double radius, area;
        radius=input.nextDouble();
        
        area= 3.1416 * radius * radius;
        System.out.println("Area of circle is "+area);
    }
}
