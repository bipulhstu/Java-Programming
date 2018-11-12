
package beginnerjava;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers to check it is armstrong or not : ");
        int num = sc.nextInt();
        
        int sum = 0;
        int temp = num;
        while (temp !=0)
        {
            int r = temp %10;
            sum = sum + r * r * r;
            temp = temp/10;
        }
        if(num == sum )
            System.out.println(num+" is an Armsrong number.");
        else
            System.out.println(num+" is not an Armsrong number.");
        
    }
}
