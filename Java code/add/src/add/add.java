
package add;

import java.util.Scanner;



public class add {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,x;
        double b,z,k;
        float c;
         System.out.println("Enter number of a :");
         a=input.nextInt();
         System.out.println("Enter number of b :");
          b=input.nextDouble();
         System.out.println("Enter number of c :");
         c=input.nextFloat();
         
       
        z=a*b*c;
        k=a/b;
        x = (int) ((double)a%b);
       System.out.println("Result = "+z);
       System.out.println("Result = "+k);
       System.out.println("Result = "+x);
        
    }
    
}
