
package encapsulation;

public class GetterAndSetterTest {
    public static void main(String[] args) {
        GetterAndSetter p1 = new GetterAndSetter();
        p1.setName("Bipul Islam");
        p1.setAge(25);
        System.out.println("Hi, Mr. "+p1.getName());
        System.out.println("Your age is "+p1.getAge());
    }
}
