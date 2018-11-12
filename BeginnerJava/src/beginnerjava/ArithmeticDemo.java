
package beginnerjava;
import java.util.Scanner;
public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Enter a number :");
        num1=input.nextInt();
        System.out.print("Enter another number :");
        num2=input.nextInt();
        
        result=num1+num2;
        System.out.println("Summation = "+result);
        
        result=num1-num2;
        System.out.println("Subtraction = "+result);
        
        result=num1*num2;
        System.out.println("Multiplication = "+result);
        
        double result2=(double)num1/num2;
        System.out.println("Division = "+result2);
        
        result=num1%num2;
        System.out.println("Remainder = "+result);
        
    }
    
}
