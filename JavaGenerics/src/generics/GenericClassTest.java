package generics;

public class GenericClassTest {
    public static void main(String[] args) {
        //integer reference
        Generic<Integer> integerGeneric;
        integerGeneric = new Generic<>(88);
        integerGeneric.showType();

        //get integer value from generic
        int v = integerGeneric.getObj();
        System.out.println("Value of v is: " + v);

        Generic<String> stringGeneric = new Generic<>("Bipul Islam");
        stringGeneric.showType();

        String stringValue = stringGeneric.getObj();
        System.out.println("Value of stringValue is: " + stringValue);
    }
}
