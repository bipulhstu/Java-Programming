
package oop;

public class Test3 {
    public static void main(String[] args) {
        //Introducing method
        Teacher teacher1 = new Teacher(); //object declaration and creation
        
        //value addition to the object  by parametrized method
        teacher1.setInformation("Bipul Islam", "Male", 1765936458);
        
        //method calling
        teacher1.displayInformation();
        
        //create another object named teacher2
        Teacher teacher2 = new Teacher(); //object declaration and creation
        
        //value addition to the object by parametrized method 
        teacher2.setInformation("Mashiur Rahman", "Male", 1781079885);      
        //method calling
        teacher2.displayInformation();
        
    }
}
