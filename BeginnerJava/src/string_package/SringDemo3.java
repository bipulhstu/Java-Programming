package string_package;

public class SringDemo3 {
    public static void main(String[] args) {
        String country = "Bangladesh is my country";
        System.out.println(country);
        
        //1. charAt() method
        char ch = country.charAt(0);
        System.out.println("ch = "+ch);
        
        //2. codePointAt() method //returns ASCII value
        int value = country.codePointAt(0);
        System.out.println("value = "+value);
        
        //3. indexOf() method
        int pos = country.indexOf("n");
        System.out.println("first position of n is "+pos);
        
        //4. lastIndexOf() method
        pos = country.lastIndexOf("n");
        System.out.println("last position of n is "+pos);
        
        //5. trim() method to remove spaces from first and last
        String myName = "   Bipul Islam    ";
        System.out.println("My Name = "+myName);
        myName= myName.trim();
        System.out.println("My Name = "+myName);
    }
}
