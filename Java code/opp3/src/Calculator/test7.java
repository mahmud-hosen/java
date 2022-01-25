
package Calculator;

import java.util.Scanner;


public class test7 {
    
    public static void main(String[]arg)
    {
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter number a = ");
       double a=input.nextDouble();
        System.out.println("Enetr number b = ");
       double b=input.nextDouble();
        stu s1=new stu();
       
       int digit;
       
       System.out.printf("Sum press 1 \n Sub press 2\n Mul press 3\n Div press 4\n ");
      
       System.out.println("Enetr Digit = ");
       digit=input.nextInt();
       switch(digit)
       {
           
      
           case 1:
        s1.sum(a,b);
          case 2:
        s1.sub(a,b);
          case 3:
        s1.mul(a,b);
          case 4:
        s1.div(a,b);
          default:
              System.out.println("Not a digit");
    }
    
    }
    
    
}
