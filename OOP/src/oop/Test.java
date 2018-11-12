
package oop;

public class Test {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher(); //object declaration and creation
        
        //value addition to the object 
        teacher1.name = "Bipul Islam";
        teacher1.gender = "Male";
        teacher1.phone = 1765936458;
        
        //printing the value of the object
        System.out.println("Name : "+teacher1.name);
        System.out.println("Gender : "+teacher1.gender);
        System.out.println("Phone : "+teacher1.phone);
        
        //create another object named teacher2
        Teacher teacher2 = new Teacher(); //object declaration and creation
        
        //value addition to the object 
        teacher2.name = "Mashiur Rahman";
        teacher2.gender = "Male";
        teacher2.phone = 1781079885;
        
        //printing the value of the object
        System.out.println("Name : "+teacher2.name);
        System.out.println("Gender : "+teacher2.gender);
        System.out.println("Phone : "+teacher2.phone);
    }
}
