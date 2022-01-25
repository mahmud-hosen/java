
package operator;

import java.util.Scanner;


public class Operator {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int a,b,c,d;
        System.out.printf("Enter number a= \n");
        a=input.nextInt();
        System.out.printf("Enter number a= \n");
        b=input.nextInt();
        c=a&b;
        System.out.printf("C = %d\n",c);
        d=a|b;
        System.out.printf("d = %d\n",d);
        
    }
    
}
