
package method_overloading;


public class OverloadTest {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.add();
        Overload ob2 = new Overload();
        ob2.add(2,3);
        Overload ob3 = new Overload();
        ob.add(2.0,3.0);
        Overload ob4 = new Overload();
        ob.add(2,3,4);
        
        
    }
}
