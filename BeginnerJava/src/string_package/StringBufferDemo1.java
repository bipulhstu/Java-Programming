
package string_package;

public class StringBufferDemo1 {
    public static void main(String[] args) {
        String s1 = "Bipul";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);
        
        //1. append() method
        sb.append(" Islam ");
        sb.append(25);
        System.out.println(sb);
        
        //2. reverse() method
        sb.reverse();
        System.out.println(sb);
        
        //3. delete method
        sb.delete(0, 5);
        System.out.println(sb);
        
        //4. setLength() method
        sb.setLength(5);
        System.out.println(sb);
    }
}
