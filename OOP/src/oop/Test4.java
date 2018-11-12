
package oop;

public class Test4 {
    public static void main(String[] args) {
        //object declaration, creation and assigning value by constructor
        Teacher2 teacher1 = new Teacher2("Bipul Islam", "Male", 1765936458);        
        //method calling
        teacher1.displayInformation();
        
        //another object declaration, creation and assigning value by constructor
        Teacher2 teacher2 = new Teacher2("Mashiur Rahman", "Male", 1781079885);     
        //method calling
        teacher2.displayInformation();
    }
}
