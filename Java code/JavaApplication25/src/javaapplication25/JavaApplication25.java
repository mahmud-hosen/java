
package javaapplication25;

import java.util.Scanner;


public class JavaApplication25 {

    
    public static void main(String[] args) {
     
        Scanner input =new Scanner(System.in);
        int[][] num=new int[5][5];
       
        
        
        
       for(int i=0;i<=2;i++)
            {
             for(int j=0;j<=2;j++)
             {
             num[i][j]=input.nextInt();
         }
         }
        
       for(int i=0;i<=2;i++)
            {
             for(int j=0;j<=2;j++)
             {
             System.out.printf(" %d ",num[i][j]);
         }
              System.out.printf("\n");
         } 
}
}