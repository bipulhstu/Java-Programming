
package oop;

public class Test2 {
    public static void main(String[] args) {
        //Introducing method
        
        Teacher teacher1 = new Teacher(); //object declaration and creation
        
        //value addition to the object 
        teacher1.name = "Bipul Islam";
        teacher1.gender = "Male";
        teacher1.phone = 1765936458;
        
        //method calling
        teacher1.displayInformation();
        
        //create another object named teacher2
        Teacher teacher2 = new Teacher(); //object declaration and creation
        
        //value addition to the object 
        teacher2.name = "Mashiur Rahman";
        teacher2.gender = "Male";
        teacher2.phone = 1781079885;
        
        //method calling
        teacher2.displayInformation();
    }
}
