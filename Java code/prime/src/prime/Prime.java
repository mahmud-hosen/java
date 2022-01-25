
package prime;

import java.util.Scanner;


public class Prime {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,Count=0;
        System.out.println("Enter any positive number");
        int num=input.nextInt();
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                Count++;
                break;
            }
    }
        if(Count==0)
        {
            System.out.println("Prime");
            
        }
        else
        {
            System.out.println("Not prime");
        }
    
}
}
