
package method_overloading;


public class CallByReferenceTest {
    public static void main(String[] args) {
        CallByReference r1 = new CallByReference();
        r1.name = "Bipul";
        System.out.println("before calling : "+r1.name);
        r1.change(r1);
        System.out.println("before calling : "+r1.name);
    }
}
