
package array_demo;


public class ArrayOutput1 {
    public static void main(String[] args) {
        
        int[][] A = new int[4][5];
        int k = 0;
        ///Assigning the value to the 2d array
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                A[row][col] = k;
                k++;
            } 
        }
        ///Printing the elements of 2d array
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+A[row][col]);
            } 
            System.out.println();
        }
    }
}
