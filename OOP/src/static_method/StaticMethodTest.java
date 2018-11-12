
package static_method;


public class StaticMethodTest {
    public static void main(String[] args) {
        //for non static method we have to create object
        StaticMethod ob1 = new StaticMethod();
        ob1.display1();
        
        //for static method we don't have to create object
        //we can directly call by class
        StaticMethod.display2();
    }
}
