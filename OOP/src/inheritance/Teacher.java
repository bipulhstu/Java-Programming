
package inheritance;

public class Teacher extends Person {
        ///Name , Age, displayInformation1
        String qualification;
        
        void displayInformation2()
        {
            displayInformation1();
            System.out.println("Qualification : "+qualification);
        }
    
}
