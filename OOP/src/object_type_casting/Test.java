
package object_type_casting;


public class Test {
    public static void main(String[] args) {
        Person p = new Teacher();
        p.display();
        Teacher t = (Teacher) new Person();
        t.display();
    }
}
