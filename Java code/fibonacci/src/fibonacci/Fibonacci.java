
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int i;
        System.out.println("Now many number : ");
        int n=input.nextInt();
        int first=0;
        int second=1;
        int fibo;
        System.out.printf("%d %d",first,second);
        for(i=3;i<=n;i++)
        {
            fibo=first+second;
            System.out.printf(" %d ",fibo);
            first=second;
            second=fibo;
            
        }
            
    }
    
}
