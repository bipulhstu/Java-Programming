
package string_comparison;



public class StringComparisonDemo {
    public static void main(String[] args) {
        String password1 = "Bipul125";
        String password2 = "Bipul125";
        String password3 = new String("Bipul125");
        String password4 = new String("Bipul125");
        
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        System.out.println();
        
        System.out.println(password1==password2);
        System.out.println(password1==password3);
        System.out.println(password3==password4);
        
    }
}
