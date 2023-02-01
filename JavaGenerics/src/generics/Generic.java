package generics;

public class Generic <T>{
    private T obj; //declared variable

    //constructor
    public Generic(T obj){
        this.obj = obj;
    }

    //access object using  accessor
    public  T getObj(){
        return  obj;
    }

    //show type
    public  void showType(){
        System.out.println("Type of T is: "+ obj.getClass().getTypeName());
    }
}
