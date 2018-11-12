
package array_demo;

import java.util.Scanner;
public class SumAndAverageOfArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];
        
        System.out.print("Please, Enter 10 numbers :");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        double sum=0;
        for (int i = 0; i < number.length; i++) {
            sum=sum+number[i];
        }
        System.out.println("The sum is :"+sum);
        
        double avg;
        avg = sum/number.length;
        System.out.println("Average of the array is :"+avg);
    }
}
