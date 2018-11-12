
package string_package;

public class StringBuilder {


    public static void main(String[] args) {
        String s1 = "Bipul";
        StringBuilder str = new StringBuilder(s1);
        
        //1. append() method
        str.append(" Islam");
        System.out.println("str = "+str);
        
        //2. reverse() method
        str.reverse();
        System.out.println("str = "+str);
        
        //3. delete() method
        str.delete();
        System.out.println("str = "+str);
        
        
    }

    private StringBuilder(String s1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void append(String _Islam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void reverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
