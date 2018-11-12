
package static_keyword;

public class Student {
    String name;
    int id;
    static String universityName = "HSTU";
    
    //constructor
    Student(String n, int i){
        name = n;
        id = i;
    }
    //method for display information
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("University Name : "+universityName);
        System.out.println("\n\n");
    }
}
