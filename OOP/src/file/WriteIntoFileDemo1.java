
package file;

import java.util.Formatter;

public class WriteIntoFileDemo1 {
    public static void main(String[] args) {
        try{
            Formatter formatter = new Formatter("C:/Users/Bipul Islam/Documents/JavaProjects/OOP/Person/student2.txt");
            formatter.format("%s %s\r\n","101", "Bipul Islam");
            formatter.format("%s %s\r\n","102", "Dinonath Roy");
            formatter.format("%s %s\r\n","103", "Sorwar Hossain");
            formatter.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
