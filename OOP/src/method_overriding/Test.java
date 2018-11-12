
package method_overriding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Bipul Islam";
        t1.age = 23;
        t1.qualification = "B.Sc in EEE";
        t1.displayInformation();
        
        Person p1 = new Person();
        p1.name = "Mashiur";
        p1.age = 24;
        p1.displayInformation();
        
    }
}
