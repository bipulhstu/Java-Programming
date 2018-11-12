
package array_demo;


public class Array1 {
    public static void main(String[] args) {
        int[] number = new int[5]; //array declaration and creation
        
        number[0] = 10;
        number[1] = 10;
        number[2] = 10;
        number[3] = 10;
        number[4] = 10;
        
        int sum = number[0] + number[1]+number[3]+number[2]+number[4];
        System.out.println("Sum of array is "+sum);
        
        int len = number.length;
        System.out.println("Size of array is "+len);
    }
}
