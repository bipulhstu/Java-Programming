
package static_block;

public class StaticBlock {
    ///static variable
    static int id;
    static String name;
    
    //static block
    static {
        id = 1502259;
        name = "Bipul Islam";
    }
    static void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
    public static void main(String[] args) {
        ///for static method no need to create object
        StaticBlock.display();
    }
}
