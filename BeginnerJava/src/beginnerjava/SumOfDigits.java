
package beginnerjava;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers : ");
        int num = sc.nextInt();
        
        int sum = 0;
        int temp = num;
        while (temp !=0)
        {
            int r = temp %10;
            sum = sum + r;
            temp = temp/10;
        }
        System.out.println("Sum of digits is : "+sum);
    }
}
