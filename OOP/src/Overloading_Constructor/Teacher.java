
package Overloading_Constructor;

public class Teacher {
   
    String name, gender;
    int phone;
    
    //default constructor
    Teacher(){
        System.out.println("No information found!!");
    }
    //parametrized constructor
    Teacher(String n, String m){
        name = n;
        gender = m;
    }
    
    //parametrized constructor
    Teacher(String n, String m, int p){
        name = n;
        gender = m;
        phone = p;
    }
    
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("\n\n");
    }
}
