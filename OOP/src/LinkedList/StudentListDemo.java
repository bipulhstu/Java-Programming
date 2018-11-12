
package LinkedList;

import java.util.LinkedList;

public class StudentListDemo {
    public static void main(String[] args) {
        ///Student LinkedList
        LinkedList<Student> list = new LinkedList<Student>();
        ///student create
        Student s1 = new Student(101, "Bipul", "EEE");
        Student s2 = new Student(102, "Dino", "EEE");
        Student s3 = new Student(103, "Sorwar", "EEE");
        Student s4 = new Student(104, "Mashiur", "EEE");
        Student s5 = new Student(105, "Rana", "EEE");
        
        //adding student list to the linked list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        //display information
        for (Student s : list){
            System.out.println(s.id+" "+s.name+" "+s.className);
        }
    }
}
