
package Overloading_Constructor;

public class OverloadingConstructorTest {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        teacher1.displayInformation();
              
        Teacher teacher2 = new Teacher("Bipul Islam", "Male");
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher("Mashiur Rahman", "Male", 1781079885);
        teacher3.displayInformation();
    }
}
