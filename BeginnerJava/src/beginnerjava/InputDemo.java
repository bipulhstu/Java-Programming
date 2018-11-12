
package beginnerjava;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        System.out.print("Please Enter your name: ");
        name = input.nextLine();
        System.out.println("Welcome Mr, "+name);
        
        int number1;
        System.out.print("Enter an integer number :");
        number1=input.nextInt();
        System.out.println("Your integer number is "+number1);
        
        double number2;
        System.out.print("Enter a double number :");
        number2=input.nextDouble();
        System.out.println("Your double number is "+number2);
        
        float number3;
        System.out.print("Enter a floating number :");
        number3=input.nextFloat();
        System.out.println("Your floating number is "+number3);
    }
    
}
