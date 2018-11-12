
package beginnerjava;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers to check it is palindrome or not : ");
        int num = sc.nextInt();
        
        int sum = 0;
        int temp = num;
        while (temp !=0)
        {
            int r = temp %10;
            sum = sum * 10+ r;
            temp = temp/10;
        }
        if(num == sum)
            System.out.println(num+" is a palindrome number.");
        else
            System.out.println(num+" is not a palindrome number.");
    }
}
