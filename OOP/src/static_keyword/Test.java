
package static_keyword;


public class Test {
    public static void main(String[] args) {
        //create two object named s1 and s2
        Student s1 = new Student("Bipul Islam" ,1502259);
        Student s2 = new Student("Dinonath Roy" ,1502232);
        
        //method call for printing information
        s1.displayInformation();
        s2.displayInformation();
        
    }
}
