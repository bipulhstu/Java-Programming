
package abstraction_problem_solving;

public class Circle extends Shape{
    Circle(double r){
        super(r, r);
    }
    void area(){
        double result = 3.1415*dim1*dim2;
        System.out.println("Circle Area : "+result);
    }
    
}
