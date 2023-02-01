package generics_with_multiple_parameter;

public class Tuple<X, Y> {

    private X x;
    private Y y;

    //constructor
    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void showTypes() {
        System.out.println("Type of T is: " + x.getClass().getTypeName() + " and Value: " + x);
        System.out.println("Type of V is: " + y.getClass().getTypeName() + " and Value: " + y);
    }


    public static void main(String[] args) {
        Tuple<String, String> stringTuple = new Tuple<>("Hello", "World");
        stringTuple.showTypes();


        Tuple<String, Integer> stringTuple2 = new Tuple<>("Roll of Bipul: ", 1);
        stringTuple2.showTypes();

        //generics inside generics
        Tuple<Integer, Tuple<String, String>> tupleInsideTuple = new Tuple<>(1, new Tuple<>("Bipul", "Islam"));
        tupleInsideTuple.showTypes();
    }
}
