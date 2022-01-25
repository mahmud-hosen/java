
package javaapplication15;

import java.util.Scanner;


public class JavaApplication15 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,j,m,n,sum=1,num;
        System.out.println("Enter number of i= ");
           m=input.nextInt();
           System.out.println("Enter number of j= ");
          n=input.nextInt();
          for(i=m;i<=n;i++) {
           for(j=1;j<=10;j++)
           {
               System.out.printf("%dX%d=%d\n",i,j,i*j);
           
    }
    System.out.printf("",sum);
}

    
    
    }
}
