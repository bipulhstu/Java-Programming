
package super_keyword;

//sub class
public class B extends A{
    int x = 5;
    void display()
    {
        System.out.println(x);    //Here x = 5
        System.out.println(super.x);  //But here x = 10
    }
}
