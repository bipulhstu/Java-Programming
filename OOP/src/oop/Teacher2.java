
package oop;

public class Teacher2 {
    String name, gender;
    int phone;
    
    //default constructor
    Teacher2(){
        System.out.println("No value!!!");
    }
    //parametrized constructor
    Teacher2(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }
    
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("\n\n");
    }
}
