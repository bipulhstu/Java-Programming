
package file;

import java.io.File;

public class FileCreationDemo {
    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir(); //folder will be created
        System.out.println("Folder created successfuly");
        
        String path = dir.getAbsolutePath();
        File file1 = new File(path+"/student.txt");
        File file2 = new File(path+"/teacher.txt");
        
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created successfuly");
        }catch(Exception e){
            System.out.println(e);
        }
        file2.delete();
        if(file2.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("File does not exist");
        }
    }
}
