
package calculator;


public class casio {
    
    
    double num1;
    double num2;
    
    void casio(double num1,double num2){
        
        this.num1=num1;
        this.num2=num2;
        
    }
    
    void sum(){
        
        double sum;
        
        sum=num1+num2;
        System.out.println("Sum is "+sum);
    }
    
    void sub(){
        
        double sub;
        
        sub=num1-num2;
        System.out.println("Sub is "+sub);
    }
    
    void Div(){
        
        double Div;
        
        Div=num1/num2;
        System.out.println("Sum is "+Div);
    }
    
    void Mul(){
        
        double Mul;
        
        Mul=num1*num2;
        System.out.println("Sum is "+Mul);
    }
    
    
}
