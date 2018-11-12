
package string_package;

public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = " This is my country";
        System.out.println("s1 = "+s1);
        
        //16. replace() method
        String s2 = s1.replace('i','j');
        System.out.println("s2 = "+s2);
        
        //17. split() method
        String[] s3=s1.split(" ");
        for (String x: s3)
        {
            System.out.println(x);
        }
    }
}
