
package sumofdrigunalmatrics;

import java.util.Scanner;


public class Sumofdrigunalmatrics {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][]num=new int[3][3];
        int sum=0,sum1=0,sum2=0 ;
        System.out.printf("Enter number");
        for(int i=0;i<=2;i++)
            for(int j=0;j<=2;j++)
            {
        {
            System.out.printf("[%d][%d] : ",i,j);
        num[i][j]=input.nextInt();
    }
    
}
        for(int i=0;i<=2;i++)
            for(int j=0;j<=2;j++)
            {
        {
        if(i==j)
        {
            sum=sum+num[i][j];
        }
         if(i<j)
        {
            sum1=sum1+num[i][j];
        }
          if(i>j)
        {
            sum2=sum2+num[i][j];
        }
    }
    
}
        
        
       
        System.out.printf("Sum of diagunal %d\n",sum);
        System.out.printf("Sum of upertrigunal %d\n",sum1);
        System.out.printf("Sum of lowertrigunal %d\n",sum2);
    
    

    }
}