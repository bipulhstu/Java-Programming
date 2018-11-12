package string_package;

public class StringDemo2 {
    public static void main(String[] args) {
        String firstName = "Bipul";
        String lastName = " Islam";
        
        //6. concat() method
        String fullName = firstName.concat(lastName);
        System.out.println("Full Name = "+fullName);
        
        //7. toUpperCase() method
        String upperName = fullName.toUpperCase();
        System.out.println("Upper Name = "+upperName);
        
        //8. toLowerCase() method
        String lowerName = fullName.toLowerCase();
        System.out.println("Lower Name = "+lowerName);
        
        //9. startsWith() method
        boolean a = firstName.startsWith("B");
        System.out.println("Start = "+a);
        
        //10. endsWith() method
        boolean b = firstName.endsWith("l");
        System.out.println("Ends = "+b);
    }
}
