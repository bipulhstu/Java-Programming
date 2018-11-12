
package string_package;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Bipul Islam";
        String s2 = new String("Bipul Islam");
        char[] s3 = {'B', 'i', 'p', 'u', 'l', '\0'};
        int len = s1.length();
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        System.out.println("s3 = "+s3);
        System.out.println("Length of s1 = "+len);
        
        //1. Comparing equality by == operator
        if(s1==s2)
            System.out.println("Equals");
        else
            System.out.println("Not Equals");
        
        //2. comparing equality by equals() operator
        if(s1.equals(s2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");
        
        //3. comparing equality by contains() method
        if(s1.contains(s2))
            System.out.println("True");
        else
            System.out.println("False");
        //or 
        boolean b = s1.contains("Islam");
        System.out.println(b);
        
        //4. comparing equality by equalsIgnoreCase() method
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");
        
        //5. isEmpty() method
        boolean a = s1.isEmpty();
        System.out.println(a);
        
    }
}
