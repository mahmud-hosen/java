
package abstractproblemsolve;

public class circle extends shape {
    
    circle(double a){
        
        
        super(a,a);
    }
    
    
    void area()
    {
        
        double result=Math.PI*o*p;
        System.out.println("Circle "+result);
    }
    
}
