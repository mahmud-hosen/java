
package output;

import java.util.Scanner;



public class Output {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double b,z;
        float c;
         System.out.println("Enter number of a");
         a=input.nextInt();
         System.out.println("Enter number of b");
          b=input.nextDouble();
         System.out.println("Enter number of c");
         c=input.nextFloat();
         
       
        z=a+b+c;
       System.out.printf("Result= %f",z);
        
    }
    
}
