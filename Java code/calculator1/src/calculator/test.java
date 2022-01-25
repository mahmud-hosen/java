
package calculator;

import java.util.Scanner;


public class test {
    
    
    
    public static void main(String[]args){
        
        while(true){
        
      Scanner scan=new Scanner(System.in);  
        
        casio ob= new casio();
        
        System.out.println("Sum press 1/n Sub press 2/n Mul  press 3/n Div press 4/n   ");
        
        System.out.println(" Which you want to choice   ");
        
        int Choice = scan.nextInt();
        
        if (Choice==1)
                {
                System.out.println(" Enter two number    ");
                double num1=scan.nextDouble();
                double num2=scan.nextDouble();
                ob.casio(num1, num2);
                
                ob.sum();
                
             
        }
        else if (Choice==2)
            {
                System.out.println(" Enter two number    ");
                double num1=scan.nextDouble();
                double num2=scan.nextDouble();
                ob.casio(num1, num2);
                ob.sub();
                
            }
            else if (Choice==3)
            {
                System.out.println(" Enter two number    ");
                double num1=scan.nextDouble();
                double num2=scan.nextDouble();
                ob.casio(num1, num2);
                ob.Mul();
            }
            else if(Choice==4)
            {
                System.out.println(" Enter two number    ");
                double num1=scan.nextDouble();
                double num2=scan.nextDouble();
                ob.casio(num1, num2);
                ob.Div();
            }
       
       
        
    }
    
    }
}
