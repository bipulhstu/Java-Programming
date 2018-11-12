
package method_overriding;

public class Teacher extends Person {
    String qualification;
    
    void displayInformation()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
        System.out.println();
    }
    
}
