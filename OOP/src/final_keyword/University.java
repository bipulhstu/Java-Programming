
package final_keyword;


public class University {
    final String UNIVERSITY_NAME = "HSTU"; //1. final variable
    final int fees;                        //2. blank final variable
    static final int area;                 //3. static blank final variable
    
    //initialize blank final variable by constructor
    University()
    {
        fees = 4000;
    }
    //initialize static blank final variable by static method
    static
    {
        area = 136;
    }
    void display()
    {
        System.out.println("University Name : "+UNIVERSITY_NAME);
        System.out.println("University Fees : "+fees+" tk");
        System.out.println("University Area : "+area+" acre");
    }
}
