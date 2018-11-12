
package file;

import java.io.File;

public class FolderCreation {
    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir(); //folder will be created
        String dirlocation = dir.getAbsolutePath(); //path
        System.out.println(dirlocation);
        
        System.out.println(dir.getName());
        if(dir.delete()){
            System.out.println(dir.getName()+" folder has been deleted successfully");
        }
    }
    
}
