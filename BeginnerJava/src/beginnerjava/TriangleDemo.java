
package beginnerjava;

import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double base  , height , area;
        System.out.println("Enter base : ");
        base = input.nextDouble();
        
        System.out.println("Enter height: ");
        height=input.nextDouble();
        
        area = 0.5 * base * height;
        System.out.println("Area of a triangle = "+area);
    }
}
