
package static_variable;

public class Student {
    static int count=0; //static variable
    
    //constructor
    Student(){
        count++;
    }
    //method for display information
    void totalStudent()
    {
        System.out.println("Total student  : "+count);
    }
}
