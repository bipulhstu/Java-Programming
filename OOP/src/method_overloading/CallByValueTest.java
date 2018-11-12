
package method_overloading;


public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x =10;
        System.out.println("x before calling : "+x);
        ob.change(x);
        System.out.println("x before calling : "+x);
    }
}
